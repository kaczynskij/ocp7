package jk.personal.manning.chapter_2.anonymous;

public class Student {

    void attendLecture() {
	Lecture l = new Lecture();
	l.notes(new Pen() {
	    public void write() {
		System.out.println("Okay! I am writing");
	    }
	});
    }
    
}
