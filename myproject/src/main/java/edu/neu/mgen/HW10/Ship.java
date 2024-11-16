package edu.neu.mgen.HW10;

import java.time.LocalDateTime;

public 
// Class representing a ship
class Ship extends Vehicle {
    private double cargoWeight;

    public Ship(String name, String color, String id, LocalDateTime dateOfProduction, double cargoWeight) {
        super(name, color, id, dateOfProduction);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void move() {
        System.out.println(getName() + " sails through oceans carrying " + cargoWeight + " tons of cargo.");
    }
}