package jk.personal.manning.chapter_2.static_keyword;

public class AssignManipulateStaticVariable {

    static {
	rate = 10;
    }
    
    static int rate = 0;
    
    static {
	++rate;
    }
    
    public AssignManipulateStaticVariable() {
	System.out.println(rate);
    }
    
    public static void main(String[] args) {
	new AssignManipulateStaticVariable();
    }
    
}
