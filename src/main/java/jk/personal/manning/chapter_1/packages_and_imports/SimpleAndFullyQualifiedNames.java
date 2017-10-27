package jk.personal.manning.chapter_1.packages_and_imports;

import jk.personal.manning.chapter_1.casting.Chair;

public class SimpleAndFullyQualifiedNames {

    public static void main(String[] args) {

	// fully-qualified name
	jk.personal.manning.chapter_1.casting.Book book = new jk.personal.manning.chapter_1.casting.Book();

	// simple name - import above
	Chair chair = new Chair();

    }

}
