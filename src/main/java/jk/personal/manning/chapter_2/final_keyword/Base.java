package jk.personal.manning.chapter_2.final_keyword;

public class Base {
    final void finalMethod() {
    }
}

class Derived extends Base {

    // won't compile
    // void finalMethod() {
    // }

}


class Base2 {
    private final void finalMethod() { }
}

class Derived2 extends Base2 {
    
    // compiles successfully, because it's not overriding
    // this method in base class is private, hence is not inherited
    final void finalMethod() { }
}