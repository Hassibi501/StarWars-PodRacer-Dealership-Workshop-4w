package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class DealershipFIleManager {
    public Dealership getDealership() {
        Dealership dealership = null;
        String fileName = "inventory.csv";
        String line;

       try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
           while ((line = bufferedReader.readLine()) != null) {
               String[] parts = line.split("\\|");

               dealership = new Dealership(parts[0], parts[1], parts[2]);

               parts =  line.split("//|");

               int vin = Integer.parseInt(parts[0]);
               int year = Integer.parseInt(parts[1]);
               String model = parts[2];
               String make = parts[3];
               String vehicleType = parts[4];
               String color = parts[5];
               int odometer = Integer.parseInt(parts[6]);
               BigDecimal price = new BigDecimal(parts[7]);

               Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

               dealership.addVehicle(vehicle);
           }
       }
       catch (IOException e) {
           e.printStackTrace();
       }

        return dealership;
    }

    public void saveDealership(Dealership dealership) {

    }
}
