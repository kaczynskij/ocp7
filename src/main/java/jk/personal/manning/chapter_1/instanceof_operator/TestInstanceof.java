package jk.personal.manning.chapter_1.instanceof_operator;

class Student {
}

public class TestInstanceof {

    public static void main(String[] args) {

	Course c = new Course("Course 1");
	Student s = new Student();
	
	// won't compile!
	// System.out.println(c instanceof Student);

    }

}
