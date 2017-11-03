package jk.personal.manning.chapter_2.inner;

public class Foo {

    // Inner inner;
    // won't compile - needs prefix
    // like that:
    Outer.Inner inner;
    
    public Foo() {
	Outer outer = new Outer();
	inner = outer.new Inner();
    }
    
}
