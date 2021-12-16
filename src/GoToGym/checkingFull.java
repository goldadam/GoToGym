package GoToGym;

import GoToGym.IOMethod.IoView;
/*
LENGTH_OF_EXERCISE 를 9개로 설정해놓음으로써 총 운동 갯수가 9개가 넘어가면 더이상 하지 못하도록 만들어놓음.
 */
public class checkingFull {
    private static final int INDEXNUM_DISPLAY = 1;
    private static final int LENGTH_OF_EXERCISE = 9; //맨몸이나 weight나 둘다 운동종류 9개.
    private static final int MAX_NUM = 10; //최대 운동갯수 10개
    private static final int DEFAULT_INT = 0;
    private static final double DEFAULT_DOUBLE = 0.0;
    private static IoView io = new IoView();
    static boolean exerciseIsFull(Workout workout){
        if(workout.getIndex() >= LENGTH_OF_EXERCISE){
            io.output("운동을 추가할 수 없습니다! 리스트가 가득 찼습니다!");
            io.output("더이상 하면 오버트레이닝 납니다!");
            return true;
        }
        return false;
    }
}
