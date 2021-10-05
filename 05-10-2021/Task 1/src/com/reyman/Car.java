package com.reyman;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private String driver;

    public Car(String make, String model, int year, String bodyStyle, String driver){
        this.make = make;

        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Make: " + make + ". Model: " + model + " ("+ year + "), BodyStyle: " + bodyStyle;
    }
}
