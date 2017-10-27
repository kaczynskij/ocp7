package jk.personal.manning.chapter_1.casting;

public class Book extends ShoppingItem implements Printable {

    public void print() {
	System.out.println("Printing book");
    }

    @Override
    public void description() {
        System.out.println("Book");
    }
    
}
