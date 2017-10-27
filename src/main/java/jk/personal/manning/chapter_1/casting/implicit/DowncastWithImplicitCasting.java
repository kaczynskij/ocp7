package jk.personal.manning.chapter_1.casting.implicit;

import jk.personal.manning.chapter_1.casting.ShoppingItem;

public class DowncastWithImplicitCasting {

    public static void main(String[] args) {

	ShoppingItem shoppingItem = new ShoppingItem();

	// won't compile - compiler cannot determine what exactly class is here
	// - ShoppingItem or some sub-class
	// Book book = shoppingItem;
	// Chair chair = shoppingItem;

	// won't compile - shoppingItem does not implements Printable
	// Printable printable = shoppingItem;
	
	// upcasting is allowed
	Object object = shoppingItem;
	
    }

}
