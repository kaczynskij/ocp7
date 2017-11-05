package jk.personal.manning.chapter_3.interfaces;

interface Livable {
    boolean status = true;
    int ratings = 10;
    void live();
}

interface GuestHouse {
    void welcome();
    void live();
}

public class Home implements Livable, GuestHouse {

    boolean status;
    static int ratings = 7;
    
    public Home() {
	System.out.println("Instance: " + status);
	System.out.println("Interface: " + Livable.status);
	
	System.out.println("Instance: " + ratings);
	System.out.println("Interface: " + Livable.ratings);
    }
    
    @Override
    public void welcome() {	
    }

    // only one implementation even, if both interfaces declares
    @Override
    public void live() {
    }

    public static void main(String[] args) {
	new Home();
    }
    
}
