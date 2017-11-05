package jk.personal.manning.chapter_3.singleton;

public class Singleton {

    private static Singleton anInstance = null;
    
    public static Singleton getInstance() {
	if(anInstance == null) {
	    anInstance = new Singleton();
	}
	return anInstance;
    }
    
    private Singleton() {
	System.out.println("Singleton: Private constructor");
    }
    
}
