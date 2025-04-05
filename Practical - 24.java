public class InsufficientFuelException extends Exception {
    public InsufficientFuelException(String message) {
        super(message);  
    }
}

import java.util.Scanner;

public class CarFuelSystem {
    private double fuelLevel;

    public CarFuelSystem(double initialFuel) {
        this.fuelLevel = initialFuel;
    }

    public void addFuel(double amount) {
        fuelLevel += amount;
        System.out.println("Added Fuel: " + amount + " liters");
        System.out.println("Current Fuel Level: " + fuelLevel + " liters");
    }

    public void drive(double fuelRequired) throws InsufficientFuelException {
        if (fuelRequired > fuelLevel) {
            throw new InsufficientFuelException("Error: Insufficient Fuel!");
        }
        fuelLevel -= fuelRequired;
        System.out.println("Drove using: " + fuelRequired + " liters");
        System.out.println("Current Fuel Level: " + fuelLevel + " liters");
    }

    public static void main(String[] args) {
      
        CarFuelSystem car = new CarFuelSystem(50);
        
        car.addFuel(50);

        try {
            car.drive(40);
        } catch (InsufficientFuelException e) {
            System.out.println(e.getMessage());
        }

        try {
            car.drive(30);
        } catch (InsufficientFuelException e) {
            System.out.println(e.getMessage());
        }

        try {
            car.drive(50);
        } catch (InsufficientFuelException e) {
            System.out.println(e.getMessage());
        }
    }
}
