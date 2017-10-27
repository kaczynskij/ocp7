package MultipleClassesWithSameName;

import java.sql.Date;

public class MultipleClassesWithSameName {

    public static void main(String[] args) {
	
	Date date = new Date(1);
	
	// second class with same name needs to be referred using FQN
	// otherwise - won't compile !
	java.util.Date utilDate = new java.util.Date();
	
	// notice - if other version of Date class is imported
	// one cannot leave right-side with simple name
	// (unless both classes are linked with inheritance line)
	// java.util.Date utilDate2 = new Date();
	
    }
    
}
