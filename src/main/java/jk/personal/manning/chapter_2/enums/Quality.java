package jk.personal.manning.chapter_2.enums;

 enum Quality {

    GOOD(5), POOR(1, "because it's broken");
    
    private int val;
    private String desc;
    
    private Quality(int val) {
	this.val = val;
    }
    
    private Quality(int val, String desc) {
	this(val);
	this.desc = desc;
    }
    
    @Override
    public String toString() {
        return this.name() + ": " + this.val + ": " + this.desc;
    }
    
}