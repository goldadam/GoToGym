package GoToGym;

import GoToGym.IOMethod.IoView;

public class checkingFull {
    private static final int INDEXNUM_DISPLAY = 1;
    private static final int LENGTH_OF_EXERCISE = 9; //맨몸이나 weight나 둘다 운동종류 9개.
    private static final int MAX_NUM = 10; //최대 운동갯수 10개
    private static final int DEFAULT_INT = 0;
    private static final double DEFAULT_DOUBLE = 0.0;
    private static IoView io = new IoView();
    static boolean exerciseIsFull(Workout workout){
        if(workout.getIndex() > LENGTH_OF_EXERCISE){
            io.output("운동을 추가할 수 없습니다! 리스트가 가득 찼습니다!");
            return true;
        }
        return false;
    }
}
