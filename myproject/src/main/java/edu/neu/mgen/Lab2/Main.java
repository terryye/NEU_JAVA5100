package edu.neu.mgen.Lab2;


public class Main {
    public static void main(String[] args) {
        Animal eagle = new Bird("Eagle", 0.7, 6.0, true, 2.0, true);
        Animal elephant = new LandAnimal("Elephant", 3.0, 6000.0, false, 4);
        Animal clownFish = new Fish("Clownfish", 0.1, 0.3, false, 5, true);

        //ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(eagle,elephant, clownFish));
        Animal[] animals = {eagle,elephant, clownFish} ;
        
        for (Animal animal : animals) {
            System.out.println("*** Animal Information ***");
            animal.displayCommonFeatures();
            animal.displaySpecificFeatures();
            System.out.println();
        }
    }
}
