package jk.personal.manning.chapter_3.singleton;

public class UseSingleton {

    public static void main(String[] args) {
	
	Singleton singleton1 = Singleton.getInstance();
	Singleton singleton2 = Singleton.getInstance();
	System.out.println(singleton1 == singleton2);
	
    }
    
}
