package jk.personal.manning.chapter_1;

class A {
    
    static {
	System.out.println("A st in");
    }
    
    {
	System.out.println("A in");
    }
    
    A() {
	System.out.println("A ctor");
    }
    
}

public class InitBlocks extends A {

    static {
	System.out.println("Abc st in");
    }
    
    {
	System.out.println("Abc in");
    }
    
    InitBlocks() {
	System.out.println("Abc ctor");
    }
    
    public static void main(String[] args) {
	new InitBlocks();
    }
    
}
