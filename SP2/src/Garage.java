import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> cars = new ArrayList<>();;
    private String carType;
    private int regNr;
    private String brandName;
    private String model;
    private int modelYear;
    private int amountOfDoors;

    public Garage(){

    }

    public void addCars(String carType, int regNr, String brandName, String model, int modelYear, int amountOfDoors){
        this.carType = carType;
        this.regNr = regNr;
        this.brandName=brandName;
        this.model = model;
        this.modelYear = modelYear;
        this.amountOfDoors = amountOfDoors;

        Bil myCar = new Bil(regNr, brandName, model, modelYear, amountOfDoors) {
            @Override
            public double beregnGrønEjerafgift() {
                return 0;
            }
        };

        cars.add(myCar);
    }

    public double beregnGrønAfgiftForBilpar(){
        double sum = 0;
        for(Bil i : cars){
            if (carType == "Benzinbil"){
                Benzinbil benzinbil = new Benzinbil(i.getRegNr(), i.getBrandName(), i.getModel(), i.getModelYear(), i.getAmountOfDoors());
                sum += benzinbil.beregnGrønEjerafgift();
            }
            if (carType == "Elbil"){
                Elbil elbil = new Elbil(i.getRegNr(), i.getBrandName(), i.getModel(), i.getModelYear(), i.getAmountOfDoors());
                sum += elbil.beregnGrønEjerafgift();
            }
            if (carType == "Dieselbil"){
                Dieselbil dieselbil = new Dieselbil(i.getRegNr(), i.getBrandName(), i.getModel(), i.getModelYear(), i.getAmountOfDoors());
                sum += dieselbil.beregnGrønEjerafgift();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.valueOf(cars);
    }
}
