package jk.personal.manning.chapter_3.interfaces;

abstract class Animal {
    
    String currentPosition;
    void move(String newPosition) {
	this.currentPosition = newPosition;
	System.out.println("New Position: " + newPosition);
    }
    
}

public class Lion extends Animal {

    void changePosition(String newPosition) {
	super.move(newPosition);
	System.out.println("New Position: " + newPosition);
    }
    
    public static void main(String[] args) {
	new Lion().changePosition("Forest");
    }
    
}
