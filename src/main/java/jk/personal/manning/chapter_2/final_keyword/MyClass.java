package jk.personal.manning.chapter_2.final_keyword;

public class MyClass {

    final int finalVar;

    public MyClass(double a, double b) {
	// the code will compile only when the final instance variable is
	// initialized in all the possibilities
	if (a > b) {
	    finalVar = 20;
	} else if (b >= a) {
	    finalVar = 30;
	} else {
	    finalVar = 40;
	}
    }
    
    public MyClass() {
	// the literals are resolved on compilation
	if(1 > 2) {
	    finalVar = 1;
	} else if(100 > 10) {
	    finalVar = 2;
	}
    }
    
    public MyClass(double a, int b) {
	finalVar = 100;
	if(a > b) {
	    // won't compile - possible reassignment
	    // finalVar = 20;
	} else if(b >= a) {
	    // won't compile - possible reassignment
	    // finalVar = 30;
	}
    }

    void setValue(final int finalMethodParam) {
	// won't compile, final method params cannot be reassigned
	// finalMethodParam = 10;

	final int finalLocalVar1;
	finalLocalVar1 = 1;

	// even if it's not initialized - the code compiles, because this
	// variable is not used
	final int finalLocalVar2;

	// System.out.println(finalLocalVar2);
    }

    void addCondition(final StringBuilder query) {
	// the object itself can change
	query.append("WHERE id > 500");

	// won't compile, cannot reassigned
	// squery = new StringBuilder("SE:ECT name FROM emp");
    }

}
