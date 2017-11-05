package jk.personal.manning.chapter_3.singleton;

public enum EnumSingleton {

    INSTANCE;
    
    public void initCache() {
	
    }
    
    private EnumSingleton() {
	System.out.println("Singleton: Private constructor");
    }
    
}
