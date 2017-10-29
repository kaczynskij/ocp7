package jk.personal.manning.chapter_2.final_keyword.tint;

abstract class MyClass {

    public final int finalVar;
    
}

class MyDerivedClass extends MyClass {
    public MyDerivedClass() {
	super();
	finalVar = 1000;
    }
}