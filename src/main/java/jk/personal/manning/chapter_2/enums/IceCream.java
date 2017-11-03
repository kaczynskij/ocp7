package jk.personal.manning.chapter_2.enums;

public enum IceCream {

    // won't compile, enum list must be first statement
    // private int price;
    
    VANILLA("white"), 
    STRAWBERRY("pink"), 
    WALNUT("brown") {
	public String toString() {
	    return "WALNUT is Brown in color";
	}
	public String flavor() {
	    return "great!";
	}
    }, 
    CHOCOLATE("dark brown");
    
    private String color;
    
    private IceCream(String color) {
	this.color = color;
    }
    
    
    public String getColor() {
	return this.color;
    }
    
    public void setColor(String val) {
	this.color = val;
    }
    
    @Override
    public String toString() {
	return "MyColor: " + color;
    }
    
}
