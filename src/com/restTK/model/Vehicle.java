package com.restTK.model;

// abstract class vehicle

public abstract class Vehicle {
    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    // abstract method to be implemented in subclasses (polymorphism)
    public abstract double calculateParkingFee(int hours);

    public void displayInfo() {
        System.out.println("Vehicle license plate: " + licensePlate);
    }
}
