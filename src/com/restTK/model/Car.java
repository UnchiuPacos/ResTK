package com.restTK.model;

//car class extends vehicle
public class Car extends Vehicle {
    private static final double HOURLY_RATE = 5.0; //constant for fee/hour

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateParkingFee(int hours) {
        return hours * HOURLY_RATE;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - License Plate: " + getLicensePlate());
    }
}
