package jk.personal.manning.chapter_2.animals;

public class Elephant extends Animal {

    public Elephant(String food, double avgLife) {
	super(food, avgLife);
    }
    
    @Override
    void eat() {
	System.out.println("Elephant eats");
    }

    void moveTrunk() {
	System.out.println("Elephant moves trunk");
    }
    
    
}
