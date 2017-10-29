package jk.personal.manning.chapter_2.animals;

public class Tiger extends Animal {

    private boolean striped;

    public Tiger(String food, double avgLife, boolean striped) {
	super(food, avgLife);
	this.striped = striped;
    }

    @Override
    void eat() {
	System.out.println("Tiger-hunt: " + food);
    }

}
