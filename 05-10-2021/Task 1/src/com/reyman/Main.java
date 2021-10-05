package com.reyman;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Opel", "Astra", 2007, "Sedan", "Rehman");
        Driver driver = new Driver(car.getDriver(), 19);
        System.out.println(car + "\n" + driver);

        Car car1 = new Car("Tesla", "Model S", 2020, "Sedan", "Rehman");
        System.out.println("\n" + car1 + "\n" + driver);
    }
}
