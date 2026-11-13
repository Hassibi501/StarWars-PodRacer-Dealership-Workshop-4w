package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Dealership {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private ArrayList<Vehicle> vehicleList;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(BigDecimal min, BigDecimal max) {
        for (Vehicle vehicle : this.vehicleList) {
            if (vehicle.getPrice().compareTo(max) <= 0 && vehicle.getPrice().compareTo(min) >= 0) {
                return vehicleList;
            }
        }
        System.err.println("Error: There are no Vehicles.");
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int brand) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int max, int min) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(VehicleType type) {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return this.vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        this.vehicleList.remove(vehicle);
    }

}

