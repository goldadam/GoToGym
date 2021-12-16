package GoToGym;

import GoToGym.IOMethod.IoView;

import static GoToGym.checkingFull.exerciseIsFull;
import static GoToGym.mainProgram.dbAccess;
import static GoToGym.selectMethod.selectExercise;
import static GoToGym.selectMethod.selectWeightExercise;
//객체가 생성되고 클래스들을 돌아다닐 때 정보가 사라지지 않게 import해서 사용함.

public class addExercise {
    private static final int INDEXNUM_DISPLAY = 1;
    private static final int LENGTH_OF_EXERCISE = 9; //맨몸이나 weight나 둘다 운동종류 9개.
    private static final int MAX_NUM = 10; //최대 운동갯수 10개
    private static final int DEFAULT_INT = 0;
    private static final double DEFAULT_DOUBLE = 0.0;
    private static IoView io = new IoView();
    private static selectMethod selectMethod = new selectMethod();

    static void addBodyExercise(Workout workout){

        int select = selectExercise();
        if(exerciseIsFull(workout)){
            io.output("workout 이 가득찼습니다.");
            return;
        }
        workout.addExercises(new Exercise(dbAccess.getWName(select), dbAccess.getWExplanation(select), addSetNumbers(1, 20), addRepsNumber(1, 99)));
        io.output("맨몸운동이 추가되었습니다.");
    }

    static void addWeight(Workout workout){

        int select = selectWeightExercise();
        if(exerciseIsFull(workout)){
            io.output("weight workout이 가득 찼습니다.");
            return;
        }
        workout.addExercises(new WeightExercise(dbAccess.getWEName(select),dbAccess.getWHExplanation(select), addSetNumbers(1, 20), addRepsNumber(1, 99) , addWeightNum(1, 1000)));

        io.output("중량운동이 추가되었습니다.");
    }

    private static int addSetNumbers(int min, int max){
        int setCount = 0;
        do{
            io.output("하고자 하고 싶은 세트수를 입력하세요 " + min + " ~ " + max + " : ");
            setCount = io.inputInt();
        }while(setCount < min || setCount > max);
        return setCount;
    }

    private static int addRepsNumber(int min, int max){
        int repCount = 0;
        do{
            io.output("하고자 하고싶은 반복수를 입력하세요 " + min + " ~ " + max + " : ");
            repCount = io.inputInt();
        }while(repCount < min || repCount > max);
        return repCount;
    }

    private static double addWeightNum(double min, double max){
        double weightCount = 0;
        do{
            io.output("하고자 하고 싶은 무게를 입력하세요" + min + " ~ " + max + " : ");
            weightCount = io.inputDouble();
        }while(weightCount < min || weightCount > max);
        return weightCount;
    }


}
