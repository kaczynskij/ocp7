package jk.personal.manning.chapter_2.enums;

public enum IceCreamTwist {

    VANILLA("white"), STRAWBERRY("pink"), WALNUT("brown"), CHOCOLATE("dark brown");

    String color;

    private IceCreamTwist(String color) {
	this.color = color;
    }

    public static void main(String[] args) {
	System.out.println(VANILLA);
	System.out.println(CHOCOLATE);
    }

}
