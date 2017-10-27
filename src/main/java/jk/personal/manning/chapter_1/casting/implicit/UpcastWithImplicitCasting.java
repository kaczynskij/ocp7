package jk.personal.manning.chapter_1.casting.implicit;

import jk.personal.manning.chapter_1.casting.Book;
import jk.personal.manning.chapter_1.casting.Chair;
import jk.personal.manning.chapter_1.casting.Printable;
import jk.personal.manning.chapter_1.casting.ShoppingItem;

public class UpcastWithImplicitCasting {

    public static void main(String[] args) {
	
	Book book = new Book();
	
	// won't compile - not connected by inheritance
	// Chair chair = book;
	
	ShoppingItem shoppingItem = book;
	Printable printable = book;
	Object object = book;
	
	Chair chair2 = new Chair();
	
	// won't compile - Chair doesn't implement Printable!
	// Printable printable2 = chair;
	
    }
    
}
