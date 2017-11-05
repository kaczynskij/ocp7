package jk.personal.manning.chapter_3.interfaces;

// invalid access modifiers
// ------------------------
// private interface MyInterface { }
// protected interface MyInterface { }


// invalid non-access modifiers
// ----------------------------
// final interface MyInterface {}
// static interface MyInterface {}
// transient interface MyInterface {}
// synchronized interface MyInterface {}
// volatile interface MyInterface {}

public interface MyInterface {

    // won't compile - members cannot be non-public
    // private int number = 10;
    // protected void aMethod();
    
    // public by default
    interface Interface2 { }
    public interface Interface4 { }
    
}

