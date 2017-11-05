package jk.personal.manning.chapter_3.singleton;

public class SyncLazyInitializationSingleton {

    private static SyncLazyInitializationSingleton anInstance = null;
    
    synchronized public static SyncLazyInitializationSingleton getInstance() {
	if(anInstance == null) {
	    anInstance = new SyncLazyInitializationSingleton();
	}
	return anInstance;
    }
    
    // and other variation of the above
    public static SyncLazyInitializationSingleton getInstance2() {
	if(anInstance == null) {
	    synchronized (Singleton.class) {
		if(anInstance == null) {
		    anInstance = new SyncLazyInitializationSingleton();
		}
	    }
	}
	return anInstance;
    }
    
    private SyncLazyInitializationSingleton() {
	System.out.println("Singleton: Private constructor");
    }
    
}
