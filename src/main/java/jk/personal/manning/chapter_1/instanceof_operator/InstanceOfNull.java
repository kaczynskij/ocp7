package jk.personal.manning.chapter_1.instanceof_operator;

import jk.personal.manning.chapter_1.casting.Book;

public class InstanceOfNull {

    public static void main(String[] args) {

	Book book = null;
	System.out.println(book instanceof Book);
	System.out.println(null instanceof Book);

	// below won't compile!
	// Exception in thread "main" java.lang.Error: Unresolved compilation
	// problems: Syntax error on token "null", invalid ReferenceType
	// System.out.println(book instanceof null);
	// System.out.println(null instanceof null);

    }

}
