package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private VehicleType vehicleType;
    private String color;
    private int odometer;
    private BigDecimal price;

    public Vehicle(String model, int vin, int year, String make, VehicleType vehicleType, String color, int odometer, BigDecimal price) {
        this.model = model;
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
        return odometer;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
