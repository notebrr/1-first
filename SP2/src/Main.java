public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addCars("Elbil", 293975, "Tesla", "Model S", 2021, 5);
        garage.addCars("Benzinbil", 293967, "Opel", "Asta", 2007, 4);
        garage.addCars("Dieselbil", 393948, "Volkswagen", "Passat", 2010, 3);
        System.out.println(garage + "\n");
        System.out.println("Samlet grøn ejerafgift: " + garage.beregnGrønAfgiftForBilpar());
    }
}
