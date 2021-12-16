package GoToGym;

import GoToGym.aboutDB.DbInterface;

public class DbAccess implements DbInterface {
    private static final int NAME_INDEX = 0;
    private final int EXPLANATION_INDEX = 1;
    @Override
    public  int getWLength() {
        return WorkoutDB.BODYWEIGHTEXERCISE.length;
    }

    @Override
    public  int getWELength() {
        return WorkoutDB.WEIGHTEDEXERCISE.length;
    }

    @Override
    public  String[] getWName() {
        int cnt = WorkoutDB.BODYWEIGHTEXERCISE.length;
        String[] names = new String[cnt];
        for(int i = 0; i < cnt; i++){
            names[i] = WorkoutDB.BODYWEIGHTEXERCISE[i][NAME_INDEX];
        }
        return names;
    }

    @Override
    public String[] getWEName() {
        int cnt = WorkoutDB.WEIGHTEDEXERCISE.length;
        String[] names = new String[cnt];
        for(int i = 0; i < cnt; i++){
            names[i] = WorkoutDB.WEIGHTEDEXERCISE[i][NAME_INDEX];
        }
        return names;
    }

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
