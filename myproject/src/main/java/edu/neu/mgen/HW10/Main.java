package edu.neu.mgen.HW10;
import java.time.LocalDateTime;

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating different vehicle objects
        Vehicle car = new Car("SUV", "Red", "CAR123", LocalDateTime.of(2023, 1, 15, 10, 0), 4);
        Vehicle aircraft = new Aircraft("Concorde", "White", "AIR789", LocalDateTime.of(2015, 8, 10, 8, 0), 2179);
        Vehicle ship = new Ship("Queen Mary 2", "Black", "SHIP101", LocalDateTime.of(2010, 12, 25, 14, 45), 148528);
        Vehicle motorbike = new Motorbike("Yamaha", "Blue", "BIKE456", LocalDateTime.of(2022, 5, 20, 15, 30), true);

        // Storing vehicles in an array
        Vehicle[] vehicles = {car, motorbike, aircraft, ship};

        // Displaying details and behaviors of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println();
        }

        // Additional feature: Finding the oldest vehicle
        System.out.println("Finding the oldest vehicle...");
        Vehicle oldestVehicle = vehicles[0];
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getDateOfProduction().isBefore(oldestVehicle.getDateOfProduction())) {
                oldestVehicle = vehicle;
            }
        }
        System.out.println("The oldest vehicle is: " + oldestVehicle.getName() + 
                " produced on " + oldestVehicle.getDateOfProduction());
    }
}