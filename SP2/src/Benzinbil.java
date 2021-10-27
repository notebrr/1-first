public class Benzinbil extends Bil{
    private float oktantal;
    private float kmPrL = 14;

    public Benzinbil(int regNr, String brandName, String model, int modelYear, int amountOfDoors){
        super(regNr, brandName, model, modelYear, amountOfDoors);
    }

    public float getOktantal() {
        return oktantal;
    }

    public void setOktantal(float oktantal) {
        this.oktantal = oktantal;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        double num = 0;
        if (kmPrL >= 20 && kmPrL <= 50){
            num = 350;
        }else if(kmPrL >= 15 && kmPrL <= 20){
            num = 1050;
        }else if (kmPrL >= 10 && kmPrL <= 15){
            num = 2340;
        }else if (kmPrL >= 5 && kmPrL <= 10){
            num = 5500;
        }else if (kmPrL < 5){
            num = 10470;
        }

        return num;
    }
}
