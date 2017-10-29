package jk.personal.manning.chapter_2.animals;

public abstract class Animal {

    protected String food;
    protected double avgLife;
    
    public Animal(String food, double avgLife) {
	this.food = food;
	this.avgLife = avgLife;
    }
    
    abstract void eat();
    
    void live() {
	System.out.println("Natural habitat: forest");
    }
    
}
