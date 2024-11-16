package edu.neu.mgen.HW10;
import java.time.LocalDateTime;

// Class representing a car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String name, String color, String id, LocalDateTime dateOfProduction, int numberOfDoors) {
        super(name, color, id, dateOfProduction);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println(getName() + " drives on roads with " + numberOfDoors + " doors.");
    }
}
