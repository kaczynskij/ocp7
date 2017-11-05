package jk.personal.manning.chapter_3.singleton;

public class EagerInitializationSingleton {

    private static EagerInitializationSingleton anInstance = new EagerInitializationSingleton();
    
    public static EagerInitializationSingleton getInstance() {
	return anInstance;
    }
    
    private EagerInitializationSingleton() {
	System.out.println("Singleton: Private constructor");
    }
    
}
