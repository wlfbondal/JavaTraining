package com.bpi.helloworld.main.OOPActivity3;


public class Car {

    private String brand;
    private String model;
    private int year;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    // Parameter
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Model
    public void setModel(String model) {
        this.model = model;
    }
    // Year
    public void setYear(int year) {
        this.year = year;
    } 
    // Display
    public void displayDetails() {
        System.out.println("Car Details: \n" + brand + " " + model + " (" + year + ")");
    }
}
