package jk.personal.manning.chapter_2.enums;

public class UseIceCream {

    public static void main(String[] args) {
	
	IceCream.VANILLA.setColor("white-white");
	System.out.println(IceCream.VANILLA.getColor());
	System.out.println(IceCream.VANILLA);
	
	System.out.println(IceCream.WALNUT);
	
	// won't compile, a constant-specific method cannot be accessed
	// System.out.println(IceCream.WALNUT.flavor());
	
    }
    
}
