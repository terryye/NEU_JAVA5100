package edu.neu.mgen.Lab2;

public class Bird extends Animal {
    private double wingspan; //meters
    private boolean canFly;

    public double getWingspan() {
        return wingspan;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public Bird(String speciesName, double typicalSize, double typicalWeight, boolean isPredator, double wingspan, boolean canFly) {
        // use Animal constructor
        super(speciesName, typicalSize, typicalWeight, isPredator);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    @Override
    public void displaySpecificFeatures() {
        System.out.println("Wingspan: " + wingspan + " meters");
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}