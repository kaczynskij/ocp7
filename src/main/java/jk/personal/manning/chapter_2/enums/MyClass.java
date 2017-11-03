package jk.personal.manning.chapter_2.enums;

public class MyClass {

    enum Level { BEGINNER, INTERMEDIATE, EXPERT }
    
    void aMethod() {
	// won't compile - cannot be a local member
	// enum Level { BEGINNER, INTERMEDIATE, EXPERT }
    }
    
}

interface MyInterface2 {
    enum Level { BEGINNER, INTERMEDIATE, EXPERT }
}
