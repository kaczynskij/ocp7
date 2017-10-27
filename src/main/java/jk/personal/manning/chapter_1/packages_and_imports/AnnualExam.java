package jk.personal.manning.chapter_1.packages_and_imports;

import static jk.personal.manning.chapter_1.packages_and_imports.certification.MultipleChoice.*;
import static jk.personal.manning.chapter_1.packages_and_imports.certification.ExamQuestion.marks;
import jk.personal.manning.chapter_1.packages_and_imports.certification.MultipleChoice;
import jk.personal.manning.chapter_1.packages_and_imports.office.*;


public class AnnualExam {

    // no import needed
    jk.personal.manning.chapter_1.packages_and_imports.certification.ExamQuestion eq;
    
    // with single-class import
    MultipleChoice mc;
    
    // wildcard import - note the asterisk in the import statement
    Cubicle c;
    ConferenceHall ch;
    
    public AnnualExam() {
	// static import from ExamQuestion
	marks = 20;
	
	// static import with wildcard from MultipleChoice
	choice = 1;
	check();
    }
    
    
}
