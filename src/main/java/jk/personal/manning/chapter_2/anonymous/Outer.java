package jk.personal.manning.chapter_2.anonymous;

public class Outer {

    private int privateOuter = 10;
    
    Object foo() {
	return new Object() {
	    public String toString() {
		return "anonymous";
	    }
	};
    }
    
    void outerMethod() {
	// won't compile - cannot instantiate before definition
	// Inner in1 = new Inner();
	
	class Inner {
	    
	    protected Inner() { }
	    public int publicInner = 100;
	    int privateInner = Outer.this.privateOuter; 
	    
	    Object foo = Outer.this.foo();
	    
	    void printOuterObjectFromInner() {
		System.out.println("Hello from inner: " + foo);
	    }
	    
	}
	Inner in2 = new Inner();
	in2.printOuterObjectFromInner();
    }
    
    public static void main(String[] args) {
	Outer outer = new Outer();
	outer.outerMethod();
    }
    
}
