package jk.personal.manning.chapter_2.static_keyword;

public class MyClass {

    // cannot - static memer cannot access non-static member
    // static int x = count();
    // int count() { return 10; }
    
    
    
    static int x = result();
    static int result() { return 20; }
    int nonStaticResult() { return result(); }
    
    
    
    
}
