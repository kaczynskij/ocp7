package jk.personal.manning.chapter_3.interfaces;

interface Livable2 {
    void live();
}

interface GuestHouse2 {
    void live(int days);
    // String live();
}

public class Home2 implements Livable2, GuestHouse2 {

    // if uncommented with GuestHouse2 - won't compile
    // incorrect overloaded method
    // public String live() { }

    @Override
    public void live() {
    }

    @Override
    public void live(int days) {
    }

    public static void main(String[] args) {
	new Home2();
    }

}
