public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Benzinbil opelAstra = new Benzinbil(293967, "Opel", "Asta", 2007, 4);
        Elbil teslaModelS = new Elbil(293975, "Tesla", "Model S", 2021, 5);
        Dieselbil volkswagenPassat = new Dieselbil(393948, "Volkswagen", "Passat", 2010, 3);


        garage.addCars(opelAstra);
        garage.addCars(teslaModelS);
        garage.addCars(volkswagenPassat);

        System.out.println(garage + "\n");
        System.out.println("Samlet grøn ejerafgift: " + garage.beregnGrønAfgiftForBilpar());
    }
}
