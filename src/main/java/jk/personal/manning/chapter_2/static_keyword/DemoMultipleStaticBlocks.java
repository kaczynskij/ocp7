package jk.personal.manning.chapter_2.static_keyword;

public class DemoMultipleStaticBlocks {

    static {
	// won't compile!
	// cannot manipulate a variable before its declaration!
	// ++staticVar;
    }
    
    static int staticVar;
    
    static {
	++staticVar;
    }
    
    public DemoMultipleStaticBlocks() {
	System.out.println("Constructor: " + staticVar);
    }
    
    public static void main(String[] args) {
	new DemoMultipleStaticBlocks();
    }
    
}
