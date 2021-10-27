public abstract class Bil {
    private int regNr;
    private String brandName; //Mærke
    private String model;
    private int modelYear; //Årgang
    private int amountOfDoors; //Døre

    public Bil(int regNr, String brandName, String model, int modelYear, int amountOfDoors){
        this.regNr = regNr;
        this.brandName = brandName;
        this.model = model;
        this.modelYear = modelYear;
        this.amountOfDoors = amountOfDoors;
    }

    public abstract double beregnGrønEjerafgift();


    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNr=" + regNr +
                ", brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", amountOfDoors=" + amountOfDoors +
                '}';
    }
}
