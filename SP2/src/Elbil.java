public class Elbil extends Bil{
    private int batterikapacitetKWh;
    private int maxKm;
    private double whPrKm = 20;

    public Elbil(int regNr, String brandName, String model, int modelYear, int amountOfDoors) {
        super(regNr, brandName, model, modelYear, amountOfDoors);
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        whPrKm = 100 / (whPrKm / 91.25);
        if (whPrKm >= 20 && whPrKm <= 50){
            whPrKm = 350;
        }else if(whPrKm >= 15 && whPrKm <= 20){
            whPrKm = 1050;
        }else if (whPrKm >= 10 && whPrKm <= 15){
            whPrKm = 2340;
        }else if (whPrKm >= 5 && whPrKm <= 10){
            whPrKm = 5500;
        }else if (whPrKm < 5){
            whPrKm = 10470;
        }

        return whPrKm;
    }
}
