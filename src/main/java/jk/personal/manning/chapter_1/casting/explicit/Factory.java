package jk.personal.manning.chapter_1.casting.explicit;

public class Factory {

    public static void main(String[] args) {
	Engineer engineer = new Engineer();

	// won't compile - final class cannot be cast to the interface 
	// it does not implement !
	// Printable printable = (Printable) engineer;
    }

}
