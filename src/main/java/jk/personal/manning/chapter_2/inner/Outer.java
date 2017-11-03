package jk.personal.manning.chapter_2.inner;

class Outer {

    Inner objInner = new Inner();
    int number = 4;
    
    
    void aMethod() {
	Inner objInn = new Inner();
    }
    
    static void staticMethod() {
	// won't compile - there's no instance of outer class to bind
	// Inner objInn = new Inner();
	// but...
	
	Outer objOut = new Outer();
	Inner objInn = objOut.new Inner();
    }
    
    protected class Inner {
	Inner() {}
	public String publicInner = "Inner";
	private int privateInner = 20;
	
	// static int staticInner = 10;
	// but...
	static final int staticInner = 10;
	
	// static void staticMethod() {}
	
	int number = 5;
	int outerNumber = Outer.this.number;
	
    }
    
}
