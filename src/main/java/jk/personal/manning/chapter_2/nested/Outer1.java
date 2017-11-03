package jk.personal.manning.chapter_2.nested;

public class Outer1 {

    public static void main(String[] args) {
	System.out.println(new Outer.StaticNested().innerInstance);
	System.out.println(Outer.StaticNested.innerStatic);
    }

}
