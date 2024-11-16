package edu.neu.mgen.HW10;
import java.time.LocalDateTime;

// Class representing an aircraft
class Aircraft extends Vehicle {
    private double cruisingSpeed;

    public Aircraft(String name, String color, String id, LocalDateTime dateOfProduction, double cruisingSpeed) {
        super(name, color, id, dateOfProduction);
        this.cruisingSpeed = cruisingSpeed;
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies at a cruising speed of " + cruisingSpeed + " km/h.");
    }
}

