package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Dealership dealership;

    UserInterface() {}

    public void display() {
        init();

        while (true) {
            System.out.println("""
                1 - Find vehicles within a price range
                2 - Find vehicles by make / model
                3 - Find vehicles by year range
                4 - Find vehicles by color
                5 - Find vehicles by mileage range
                6 - Find vehicles by type (car, truck, SUV, van)
                7 - List ALL vehicles
                8 - Add a vehicle
                9 - Remove a vehicle
                99 - Quit
                """);
            int menuOption = getValidUserInput();

            switch (menuOption) {
                case 1:
                    processGetByPriceRequest();
                    System.out.println();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    System.out.println();
                    break;
                case 3:
                    processGetByYearRequest();
                    System.out.println();
                    break;
                case 4:
                    processGetByColorRequest();
                    System.out.println();
                    break;
                case 5:
                    processGetByMileageRequest();
                    System.out.println();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    System.out.println();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    System.out.println();
                    break;
                case 8:
                    processAddVehicleRequest();
                    System.out.println();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    System.out.println();
                    break;
                case 99:
                    System.out.println("Exiting Program. Goodbye!");
                    return;
            }
        }

    }

    private void init() {
        DealershipFIleManager dealershipFIleManager = new DealershipFIleManager();
        this.dealership = dealershipFIleManager.getDealership();
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        System.out.println("-----------------------");
        for (Vehicle vehicle : vehicles) {
            System.out.printf("""
                    Vin Number: %d
                    Year: %d
                    Make: %s
                    Model: %s
                    Vehicle Type: %s
                    Color: %s
                    Odometer/Mileage: %d
                    Price: %.2f
                    -----------------------
                    """,
                    vehicle.getVin(), vehicle.getYear(), vehicle.getMake(),
                    vehicle.getModel(), vehicle.getVehicleType(), vehicle.getColor(),
                    vehicle.getOdometer(), vehicle.getPrice());
        }
    }


    public void processGetByPriceRequest() {
        System.out.println("display by price");
    }

    public void processGetByMakeModelRequest() {
        System.out.println("display by make and model");
    }

    public void processGetByYearRequest() {
        System.out.println("display by year");
    }

    public void processGetByColorRequest() {
        System.out.println("display by color");
    }

    public void processGetByMileageRequest() {
        System.out.println("display by mileage");
    }

    public void processGetByVehicleTypeRequest() {
        System.out.println("display by vehicle type");
    }

    public void processGetAllVehiclesRequest() {
        System.out.println("list all vehicles");
        ArrayList<Vehicle> vehicleList = this.dealership.getAllVehicles();
        displayVehicles(vehicleList);
    }

    public void processAddVehicleRequest() {
        System.out.println("add vehicle");
    }

    public void processRemoveVehicleRequest() {
        System.out.println("remove vehicle");
    }

    public int getValidUserInput() {
        Scanner scanner = new Scanner(System.in);
        String menuOption;
        while (true) {
            System.out.println("Enter menu option (1, 2, 3, 4, 5, 6, 7, 8, 9, 99): ");

            menuOption = scanner.nextLine();

            if (menuOption.isEmpty()) {
                System.out.println("Error: Input can not be empty.");
                continue;
            }

            if (!menuOption.matches("^[123456789]$|^9{2}$")) {
                System.out.println("Error: Invalid input.");
                continue;
            }
            return Integer.parseInt(menuOption);

        }
    }

}
