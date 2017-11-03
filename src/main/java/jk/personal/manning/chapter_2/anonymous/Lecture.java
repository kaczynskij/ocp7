package jk.personal.manning.chapter_2.anonymous;

public class Lecture {

    Pen pen = new Pen();
    
    Pen anonymousPen = new Pen() {
	
	public void write() {
	    System.out.println("Writing with a pen");
	}
	
	public void newMethod() {
	    System.out.println("New method");
	}
	
    };
    
    public static void main(String[] args) {
	
	Lecture l = new Lecture();
	l.pen.write();
	l.anonymousPen.write();
	
	// can define in anonymous class, but cannot invoke
	// l.pen.newMethod();
	
    }
    
    public void notes(Pen pen) {
	pen.write();
    }
    
}
