package GoToGym;
import GoToGym.IOMethod.IoView;
import lombok.*;

import java.util.*;
//Getter와 ToString()을 오버로딩 해서 사용함.
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
    /*
    Exercise Length를 구하기 위해 사용, 기본적으로 설정한 Exercise 배열을 길이 30으로
    만들었는데, 나머지 값들이 null로 초기화되었기 때문에 filter 를 사용해 null 을없애고 count를
    리턴해주게 만듦.
     */
    public int getExerciseLength(){
        return (int) Arrays.stream(exercises).filter(p -> p!=null).count();
    }
    public Exercise[] getExercise(){
        return exercises;
    }

    /*
    운동추가하는 메서드, Exercise에서 중복된다는 운동이 있다고 할 시
    원래있던 운동이 삭제되고 새로운 운동으로 대체됨
     */
    public void addExercises(Exercise exercise){
        for(int i =0; i<this.index; i++){
            if(exercises[i].equals(exercise)){
                io.output("=========================================");
                io.output("\n");
                io.output(exercises[i]+" -> 가 원래 있던 운동이라서 "+exercise+"로 대체됩니다");
                io.output("=========================================");
                exercises[i] = exercise;
                return;
            }
        }
        this.exercises[this.index] = exercise;
        this.index +=1; //exercise[] 배열에서 index를 이용해 count해주는 역할.

    }
    /*
    운동삭제 메서드, 삭제할 번호에 들어가 있는 것을 삭제하고 index 넘버를 감소시킴
     */
    public void exerciseRemove(int removeNum){
        if(removeNum >= 0 && this.index > removeNum){
            for(int i = 0; i < index; i++){
                exercises[removeNum+i] = exercises[removeNum + i +1];
            }
            this.index--;
        }
    }
}
