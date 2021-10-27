public class Dieselbil extends Bil{
    private boolean harPartikelfilter;
    private float kmPrL = 15;

    public Dieselbil(int regNr, String brandName, String model, int modelYear, int amountOfDoors) {
        super(regNr, brandName, model, modelYear, amountOfDoors);
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        double num = 0;
        if (kmPrL >= 20 && kmPrL <= 50){
            num = 350 + 130;
        }else if(kmPrL >= 15 && kmPrL <= 20){
            num = 1050 + 1390;
        }else if (kmPrL >= 10 && kmPrL <= 15){
            num = 2340 + 1850;
        }else if (kmPrL >= 5 && kmPrL <= 10){
            num = 5500 + 2770;
        }else if (kmPrL < 5){
            num = 10470 + 15260;
        }

        return num;
    }
}
