
package GoToGym;
/*
Exercise를 상속받아 마찬가지로 sets, reps등을 설정하고 실행가능하게 만듦.
 */

public class WeightExercise extends Exercise{
    private double weight =0;
    public WeightExercise(String name, String explanation, int sets, int reps, double weight){
        super(name, explanation, sets, reps);
        this.weight = weight; //exercise에 weight가 없음...
    }

    @Override
    public String toString(){
        return this.getName() + "  sets:  " + this.getSets() + "   reps: "+ this.getSets() + "   weight: " + this.weight +"kg  " + this.getExplanation();

    }



}
