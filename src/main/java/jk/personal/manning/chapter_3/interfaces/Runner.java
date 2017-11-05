package jk.personal.manning.chapter_3.interfaces;

public strictfp interface Runner extends Athlete, Walker {

    // implicitly public abstract
    int speed();

    // implicitly public static final;
    double distance = 50;

}

interface Athlete {
}

interface Walker {
}