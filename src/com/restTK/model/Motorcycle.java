package com.restTK.model;

//motorcycle extends vehicle
public class Motorcycle extends Vehicle {
    private static final double HOURLY_RATE = 2.0;

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateParkingFee(int hours) {
        return hours * HOURLY_RATE;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle - License Plate: " + getLicensePlate());
    }
}
