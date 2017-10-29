package jk.personal.manning.chapter_2.final_keyword;

public class TestFinal {

    static final int staticFinal2 = 12345;
    static final int staticFinal;
    
    static {
	staticFinal = 1234;
    }
    
    // cannot! won't compile
    // setStaticFinal(int value) {
	// staticFinal = value;
    // }
    
}
