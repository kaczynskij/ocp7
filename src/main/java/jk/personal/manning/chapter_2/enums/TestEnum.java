package jk.personal.manning.chapter_2.enums;

import java.util.Arrays;

public class TestEnum {

    public static void main(String[] args) {

	System.out.println("name(): " + Level.BEGINNER.name());
	System.out.println("toString(): " + Level.BEGINNER);
	System.out.println("valueOf(): " + Level.valueOf("BEGINNER"));
	System.out.println("BEGINNER.ordinal(): " + Level.BEGINNER.ordinal());

	System.out.println();
	System.out.println("Sorting:");
	System.out.println("========");
	Level[] values = Level.values();
	Arrays.sort(values);
	for (Level l : values) {
	    System.out.println(l);
	}

    }

}
