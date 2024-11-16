package edu.neu.mgen.HW10;

import java.time.LocalDateTime;

// Abstract class representing a general vehicle
abstract class Vehicle {
    private String name;
    private String color;
    private String id;
    private LocalDateTime dateOfProduction;

    // Unmutable Object
    public Vehicle(String name, String color, String id, LocalDateTime dateOfProduction) {
        this.name = name;
        this.color = color;
        this.id = id;
        this.dateOfProduction = dateOfProduction;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDateOfProduction() {
        return dateOfProduction;
    }

    // Abstract method to be implemented by subclasses
    public abstract void move();

    // Display vehicle details
    public void displayInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("ID: " + id);
        System.out.println("Date of Production: " + dateOfProduction);
    }
}