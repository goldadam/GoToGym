package GoToGym;
import GoToGym.IOMethod.IoView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//유산소 운동 및 맨몸운동 만드는 Exercise 클래스, 중량운동은 이 클래스 상속받아서 Weight 변수만 추가해서 다시 만드는 식으로 진행.
import java.util.*;
import java.io.*;
/*
Getter 와 Setter를 오버로딩으로 구현해놓음.
 */
@AllArgsConstructor
@Setter
@ToString
@Getter
//맨몸운동 설명하는 클래스.
public class Exercise {
    private static IoView io = new IoView();
    private String name;
    private String explanation;
    private int sets;
    private int reps;

    /*
    toString 메서드를 오버라이딩해 사용자가 입력해 놓은 이름과 세트, reps등을 리턴해줌.
     */
    @Override
    public String toString() {
        return this.getName() + "  sets:  " + this.getSets() + "   reps:   " + this.getReps() + this.getExplanation();
    }

    /*
    중복제거를 위한 메서드, equals를 오버라이딩해서 객체 자체를 비교할 수 있게 만들어 놓음
    운동 세트보단 이름에 초점을 두고 이름이 같으면 같은 운동이라고 가정후 운동을 삭제함.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(name, exercise.name);
    }


}
