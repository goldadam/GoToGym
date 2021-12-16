package GoToGym;


import GoToGym.IOMethod.IoView;

public class printMethod {
    private static final int INDEXNUM_DISPLAY = 1;
    private static final int LENGTH_OF_EXERCISE = 9; //맨몸이나 weight나 둘다 운동종류 9개.
    private static final int DEFAULT_INT = 0;
    private static final double DEFAULT_DOUBLE = 0.0;
    private static IoView io = new IoView();
    static void printExerciseName(Workout workout){
        io.output("==================");
        for(int i = 0;  i< workout.getIndex(); i++){
            io.output("<" + (i + INDEXNUM_DISPLAY) + ">" + workout.getExercise()[i].getName().toString());
        }
    }
    static void printExercise(Workout workout){
        io.output("===============");
        io.output("Workout name: " + workout.getName());
        for(int i = 0; i < workout.getIndex(); i++){
            io.output("<"+ (i+INDEXNUM_DISPLAY) + ">" + workout.getExercise()[i].toString() );
        }
    }


    static void printNames(String[] names){
        for(int i =0; i < names.length; i++){
            System.out.println("(" + (i+1) + ")" + names[i]);
        }
    }


    static void printCat(){
        io.output("\\    /\\\n"+
                " )  ( ')\n"+
                "(  /  )\n"+
                " \\(__)|");
        io.output("/\\\\_/\\\\");
        io.output("/ o o \\");
        io.output("       /\\_/\\");
        io.output("      / 0 0 \\  ");
        io.output("     (   \"   )");
        io.output("      \\~(*)~/  ");
        io.output("       // \\\\");
    }


}
