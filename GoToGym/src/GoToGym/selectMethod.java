package GoToGym;

import GoToGym.IOMethod.IoView;

import static GoToGym.mainProgram.dbAccess;
import static GoToGym.printMethod.printNames;


public class selectMethod {
    private static final int INDEXNUM_DISPLAY = 1;
    private static final int LENGTH_OF_EXERCISE = 9; //맨몸이나 weight나 둘다 운동종류 9개.
    private static final int DEFAULT_INT = 0;
    private static final double DEFAULT_DOUBLE = 0.0;
    private static IoView io = new IoView();
    public static int selectExercise(){
        int select = DEFAULT_INT;
        io.output("운동을 골라주세요.");
        printNames(dbAccess.getWName());
        do{
            io.output("추가할 운동 번호를 입력해주세요." + INDEXNUM_DISPLAY + "~" + dbAccess.getWLength() + ".");
            select = io.inputInt();
        }while(dbAccess.getWLength() < select || select < INDEXNUM_DISPLAY);
        return select - INDEXNUM_DISPLAY;
    }

    public static int selectWeightExercise(){
        int select = DEFAULT_INT;
        io.output("운동을 골라주세요");
        printNames(dbAccess.getWEName());
        do{
            io.output("추가할 운동 번호를 입력해주세요." + INDEXNUM_DISPLAY + " ~ " + dbAccess.getWELength() + ".");
            select = io.inputInt();
        }while(dbAccess.getWLength() < select || select < INDEXNUM_DISPLAY);
        return select - INDEXNUM_DISPLAY;
    }

}
