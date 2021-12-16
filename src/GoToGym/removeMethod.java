package GoToGym;

import GoToGym.IOMethod.IoInterface;
import GoToGym.IOMethod.IoView;

import java.util.Scanner;

public class removeMethod {
    private static final int INDEXNUM_DISPLAY = 1;
    private static final int LENGTH_OF_EXERCISE = 9; //맨몸이나 weight나 둘다 운동종류 9개.
    private static final int DEFAULT_INT = 0;
    private static final double DEFAULT_DOUBLE = 0.0;
    private static IoInterface io = new IoView();
    static void removeExercise(Workout workout){
        Scanner sc1 = new Scanner(System.in);
        int selectNum = 0;
        if(workout.getIndex() == 0){
            io.output("번호를 잘못입력하셨습니다. 선택하신 운동이 리스트에 없습니다.");
            return;
        }
        do{
            io.output("삭제할 번호를 입력해주세요. 종료하려면 99를 입력해주세요.");
            printMethod.printExerciseName(workout);
            selectNum = sc1.nextInt();
            if(selectNum == 99  ){
                System.exit(0); //무조건 종료 실시.
            }
        }while(selectNum < 0 || workout.getIndex() < selectNum);
        if(selectNum == 0){
            return;
        }
        selectNum -= INDEXNUM_DISPLAY;
        workout.exerciseRemove(selectNum);
        io.output("운동" + (selectNum + INDEXNUM_DISPLAY) + "가 성공적으로 제거되었습니다.");

    }
}
