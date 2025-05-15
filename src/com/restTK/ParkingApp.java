package com.restTK;

import com.restTK.model.Car;
import com.restTK.model.Motorcycle;
import com.restTK.service.ParkingLot;

public class ParkingApp {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(3);

        Car car1 = new Car("TM 45 DRE");
        Motorcycle moto1 = new Motorcycle("MOTO O7");
        Car car2 = new Car("B 123 AAA");

        lot.parkVehicle(car1);
        lot.parkVehicle(moto1);
        lot.parkVehicle(car2);

        lot.listVehicles();

        System.out.println();

        System.out.println("Parking fee for car1 (3 hours): $" + car1.calculateParkingFee(3));
        System.out.println("Parking fee for moto1 (3 hours): $" + moto1.calculateParkingFee(3));

        System.out.println();

        lot.removeVehicle("MOTO1");
        lot.listVehicles();
    }
}
