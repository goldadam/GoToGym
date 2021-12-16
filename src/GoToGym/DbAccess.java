package GoToGym;

import GoToGym.aboutDB.DbInterface;

public class DbAccess implements DbInterface {
    /*
    인터페이스로 구현해놓은 맨몸운동과 중량운동에 접근하는 메서드들 구현해놓음.
     */
    private static final int NAME_INDEX = 0;
    private final int EXPLANATION_INDEX = 1;
    /*
    맨몸운동과 중량운동 length 받아옴.
     */
    @Override
    public  int getWLength() {
        return WorkoutDB.BODYWEIGHTEXERCISE.length;
    }

    @Override
    public  int getWELength() {
        return WorkoutDB.WEIGHTEDEXERCISE.length;
    }
    //운동 이름 받아옴.
    @Override
    public  String[] getWName() {
        int cnt = WorkoutDB.BODYWEIGHTEXERCISE.length;
        String[] names = new String[cnt];
        for(int i = 0; i < cnt; i++){
            names[i] = WorkoutDB.BODYWEIGHTEXERCISE[i][NAME_INDEX];
        }
        return names;
    }
    //운동이름 받아놓음(중량운동)
    @Override
    public String[] getWEName() {
        int cnt = WorkoutDB.WEIGHTEDEXERCISE.length;
        String[] names = new String[cnt];
        for(int i = 0; i < cnt; i++){
            names[i] = WorkoutDB.WEIGHTEDEXERCISE[i][NAME_INDEX];
        }
        return names;
    }
    //index를 이용해 운동의 이름 받아오기
    @Override
    public  String getWName(int index) {
        return WorkoutDB.BODYWEIGHTEXERCISE[index][NAME_INDEX];
    }

    @Override
    public  String getWEName(int index) {
        return WorkoutDB.WEIGHTEDEXERCISE[index][NAME_INDEX];
    }

    @Override
    public  String getWExplanation(int index) {
        return WorkoutDB.BODYWEIGHTEXERCISE[index][EXPLANATION_INDEX];
    }

    @Override
    public  String getWHExplanation(int index) {
        return WorkoutDB.WEIGHTEDEXERCISE[index][EXPLANATION_INDEX];
    }


}
