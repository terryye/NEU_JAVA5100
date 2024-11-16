package edu.neu.mgen.HW10;
import java.time.LocalDateTime;

// Class representing a motorbike
class Motorbike extends Vehicle {
    private boolean hasHelmet;

    public Motorbike(String name, String color, String id, LocalDateTime dateOfProduction, boolean hasHelmet) {
        super(name, color, id, dateOfProduction);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void move() {
        System.out.println(getName() + " zooms on roads and " + (hasHelmet ? "has a helmet for safety." : "does not have a helmet."));
    }
}
