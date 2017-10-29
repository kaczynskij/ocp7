package jk.personal.manning.chapter_2.final_keyword;

public class InstanceFinalVariables {

    final int finalVar2 = 710;
    final int finalVar;
    
    public InstanceFinalVariables() {
	finalVar = 10;
    }
    
    void setValue(int a) {
	// won't compile
	// finalVar = a;
    }
    
}
