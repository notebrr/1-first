import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> cars = new ArrayList<>();;

    public Garage(){

    }

    public void addCars(Bil bil){
        cars.add(bil);
    }

    public double beregnGrønAfgiftForBilpar(){
        double sum = 0;
        for(Bil i : cars){
            sum = (sum + i.beregnGrønEjerafgift());
        }
        return sum;
    }

    @Override
    public String toString() {
        return cars.toString();
    }
}
