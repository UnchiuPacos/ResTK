package com.restTK.service;

import com.restTK.model.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * ParkingLot manages vehicles parked inside.
 */
public class ParkingLot {
    private int capacity;
    private List<Vehicle> parkedVehicles;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        parkedVehicles = new ArrayList<>();
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (parkedVehicles.size() < capacity) {
            parkedVehicles.add(vehicle);
            System.out.println("Vehicle " + vehicle.getLicensePlate() + " parked.");
            return true;
        } else {
            System.out.println("Parking full! Cannot park " + vehicle.getLicensePlate());
            return false;
        }
    }

    public boolean removeVehicle(String licensePlate) {
        for (Vehicle v : parkedVehicles) {
            if (v.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                parkedVehicles.remove(v);
                System.out.println("Vehicle " + licensePlate + " removed.");
                return true;
            }
        }
        System.out.println("Vehicle " + licensePlate + " not found.");
        return false;
    }

    public void listVehicles() {
        if (parkedVehicles.isEmpty()) {
            System.out.println("Parking lot empty.");
            return;
        }
        System.out.println("Vehicles in parking lot:");
        for (Vehicle v : parkedVehicles) {
            v.displayInfo();
        }
    }
}
