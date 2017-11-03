package jk.personal.manning.chapter_2.nested;

class Outer {

    static int outerStatic = 10;
    
    int outerInstance = 20;
    
    static class StaticNested {
	static int innerStatic = 10;
	int innerInstance = 20;
    }
    
    public static void main(String[] args) {
	
	// does not need to be prefixed with outer class
	// since it's instantiated within outer class
	StaticNested nested1 = new StaticNested(); 
	
	Outer.StaticNested nested2 = new Outer.StaticNested();
	nested1.innerStatic = 99;
	nested1.innerInstance = 999;
	
	System.out.println(nested1.innerStatic + ":" + nested1.innerInstance);
	System.out.println(nested2.innerStatic + ":" + nested2.innerInstance);
	
    }
    
}
