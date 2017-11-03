package jk.personal.manning.chapter_2.nested;

public class AnotherClass {

    Outer.StaticNested nested1 = new Outer.StaticNested();
    // won't compile - need to refer with outer class name
    // unless the import will be included: import jk.<pack>.Outer.StaticNested;
    // StaticNested nested2 = new StaticNested();

}
