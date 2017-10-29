package jk.personal.manning.chapter_2.animals;

public class Lion extends Animal {

    public Lion(String food, double avgLife) {
	super(food, avgLife);
    }
    
    @Override
    void eat() {
	System.out.println("Lion-hunt " + this.food);
    }

}
