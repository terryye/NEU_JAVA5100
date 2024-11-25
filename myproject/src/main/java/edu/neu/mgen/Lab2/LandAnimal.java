package edu.neu.mgen.Lab2;

public class LandAnimal extends Animal {
    private int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public LandAnimal(String speciesName, double typicalSize, double typicalWeight, boolean isPredator, int numberOfLegs) {
        // use Animal constructor
        super(speciesName, typicalSize, typicalWeight, isPredator);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displaySpecificFeatures() {
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}