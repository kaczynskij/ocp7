package jk.personal.manning.chapter_2.final_keyword;

public class FinalStatic {

    // won't compile even if it is left with no initialization
    // static final int finalVar;
    
    public FinalStatic() {
	// won't compile, since cannot be reassigned
	// and constructor re-assigns every time an object is created
	// finalVar = 10;
    }
    
}
