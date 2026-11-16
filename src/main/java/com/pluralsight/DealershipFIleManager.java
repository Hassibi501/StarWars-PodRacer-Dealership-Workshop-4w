package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class DealershipFIleManager {
    public Dealership getDealership() {
        String fileName = "inventory.csv";
        String line;

       try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
           // First reading and extracting header data from csv file and initializing it to an instance of the Dealership class
           String[] dealershipParts = bufferedReader.readLine().split("\\|");
           Dealership dealership = new Dealership(dealershipParts[0], dealershipParts[1], dealershipParts[2]);

           while ((line = bufferedReader.readLine()) != null) {
               // Then extracting data from the rest of the csv file and initializing it to an instance of the Vehicle class
               String[] parts = line.split("\\|");

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
           return dealership;
       }
       catch (IOException e) {
            e.printStackTrace();
       }

       return null;
    }

    public void saveDealership(Dealership dealership) {

    }
}
