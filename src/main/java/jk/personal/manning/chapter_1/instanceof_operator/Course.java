package jk.personal.manning.chapter_1.instanceof_operator;

public class Course {

    String title;

    public Course(String t) {
	this.title = t;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Course) {
	    Course c = (Course) obj;
	    return this.title.equals(c.title);
	} else {
	    return false;
	}
    }

}
