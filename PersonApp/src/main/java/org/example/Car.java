package org.example;

public class Car {
    private String make;
    private String model;

    public Car() {
        System.out.println("Default Constructor");
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("2 args constructor");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void displayInfo(){
        System.out.println("Data is: "+make+" "+ model);
    }
}