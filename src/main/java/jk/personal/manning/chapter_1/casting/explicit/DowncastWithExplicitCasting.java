package jk.personal.manning.chapter_1.casting.explicit;

import jk.personal.manning.chapter_1.casting.Book;
import jk.personal.manning.chapter_1.casting.Chair;
import jk.personal.manning.chapter_1.casting.Printable;
import jk.personal.manning.chapter_1.casting.ShoppingItem;

public class DowncastWithExplicitCasting {

    static void downCast(ShoppingItem item) {
	Book book = (Book) item;
	Chair chair = (Chair) item;
	Printable printable = (Printable) item;
    }

    public static void main(String[] args) {

	// Exception in thread "main" java.lang.ClassCastException:
	// jk.personal.manning.chapter_1.casting.ShoppingItem cannot be cast to
	// jk.personal.manning.chapter_1.casting.Book
	ShoppingItem item = new ShoppingItem();
	downCast(item);

    }

}
