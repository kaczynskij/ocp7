package jk.personal.manning.chapter_1.casting.explicit;

import jk.personal.manning.chapter_1.casting.Book;
import jk.personal.manning.chapter_1.casting.ShoppingItem;

public class AccessMembersWithExplicitCasting {

    static void accessMember(ShoppingItem item) {

	// multi-line access
	Book book = (Book) item;
	book.description();

	// one-line access
	((Book) item).description();

    }

}
