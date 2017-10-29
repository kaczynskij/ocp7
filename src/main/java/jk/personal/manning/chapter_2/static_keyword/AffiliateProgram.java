package jk.personal.manning.chapter_2.static_keyword;

import java.io.FileNotFoundException;

public class AffiliateProgram {

    private static int accountOpenBonusFromLiteral = 5;
    private static int accountOpenBonusFromSIB;
    private static int accountOpenBonusFromMethod = initAccountOpenBonus();

    // initializing method cannot declare any checked exceptions
    // private static int accountOpenBonusFromMethodWithExc = initAccountOpenBonusWithExc();
    private static int accountOpenBonusFromMethodWithExc;
    
    static {

	if (Math.random() > 0.5) {
	    accountOpenBonusFromSIB = 5;
	} else {
	    accountOpenBonusFromSIB = 15;
	}
	
	try {
	    accountOpenBonusFromMethodWithExc = initAccountOpenBonusWithExc();
	} catch (FileNotFoundException e) {
	    // TODO: handle exception
	}

    }

    private static int initAccountOpenBonus() {
	if (Math.random() > 0.5) {
	    return 5;
	} else {
	    return 15;
	}
    }

    private static int initAccountOpenBonusWithExc() throws FileNotFoundException {
	double rnd = Math.random();
	if (rnd > 0.5) {
	    return 5;
	} else if (rnd < 0.1) {
	    throw new FileNotFoundException("This is not a good practice; only for demo purposes");
	} else {
	    return 15;
	}
    }

}
