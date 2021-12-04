package GoToGym;
import lombok.*;

import java.util.*;

@Getter
public class Workout {
    private String name;
    private String gender;
    private Exercise[] exercises = new Exercise[30];
    private int index;

    public Workout(String name, String gender){
        this.name = name;
        this.gender = gender;
    }



    public void addExercises(Exercise exercise){
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
