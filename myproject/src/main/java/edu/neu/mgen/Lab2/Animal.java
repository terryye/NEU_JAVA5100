package edu.neu.mgen.Lab2;

public abstract class Animal {

    //immmutable propertied
    private String speciesName;
    private double typicalSize;  //meters
    private double typicalWeight; //kg
    private boolean isPredator;

    public Animal(String speciesName, double typicalSize, double typicalWeight, boolean isPredator) {
        this.speciesName = speciesName;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.isPredator = isPredator;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public double getTypicalSize() {
        return typicalSize;
    }

    public double getTypicalWeight() {
        return typicalWeight;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public abstract void displaySpecificFeatures();

    public void displayCommonFeatures() {
        System.out.println("Species Name: " + speciesName);
        System.out.println("Typical Size: " + typicalSize + " meters");
        System.out.println("Typical Weight: " + typicalWeight + " kg");
        System.out.println("Is Predator: " + (isPredator ? "Yes" : "No"));
    }
}