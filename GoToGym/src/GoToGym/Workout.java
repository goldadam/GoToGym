package GoToGym;
import GoToGym.IOMethod.IoView;
import lombok.*;

import java.util.*;

@Getter
@ToString
public class Workout {
    private String name;
    private String gender;
    private Exercise[] exercises = new Exercise[30];
    private int index;
    private static IoView io = new IoView();

    public Workout(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public int getExerciseLength(){
        return (int) Arrays.stream(exercises).filter(p -> p!=null).count();
//        return exercises.length;

    }
    public Exercise[] getExercise(){
        return exercises;
    }



    public void addExercises(Exercise exercise){
        for(int i =0; i<this.index; i++){
            if(exercises[i].equals(exercise)){
                io.output("=========================================");
                io.output("\n");
                io.output(exercises[i]+" -> 가 원래 있던 운동이라서 "+exercise+"로 대체됩니다");
                exercises[i] = exercise;
                return;
            }
        }
        this.exercises[this.index] = exercise;
        this.index +=1;

    }
    public void exerciseRemove(int removeNum){
        if(removeNum >= 0 && this.index > removeNum){
            for(int i = 0; i < index; i++){
                exercises[removeNum+i] = exercises[removeNum + i +1];
            }
            this.index--;
        }
    }
}
