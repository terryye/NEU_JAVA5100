package edu.neu.mgen.Lab2;

public class Fish extends Animal {
    private int numberOfFins;
    private boolean isSaltwater;

    public Fish(String speciesName, double typicalSize, double typicalWeight, boolean isPredator, int numberOfFins, boolean isSaltwater) {
        // use Animal constructor
        super(speciesName, typicalSize, typicalWeight, isPredator);
        this.numberOfFins = numberOfFins;
        this.isSaltwater = isSaltwater;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public boolean getIsSaltwater() {
        return isSaltwater;
    }

    @Override
    public void displaySpecificFeatures() {
        System.out.println("Number of Fins: " + numberOfFins);
        System.out.println("Lives in Saltwater: " + (isSaltwater ? "Yes" : "No"));
    }
}