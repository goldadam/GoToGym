package GoToGym;

public class workoutStart extends Exercise{
    private double weight;
    public workoutStart(String userName, String name, String explanation, int sets, int reps, double weight){
        super(userName, name, explanation, sets, reps);
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "name" + this.getUserName() +this.getName() + "sets; " + this.getSets() + "reps: "+ this.getSets() + "weight" + this.weight +"kg" + this.getExplanation();

    }



}
