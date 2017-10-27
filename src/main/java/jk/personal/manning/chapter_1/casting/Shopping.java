package jk.personal.manning.chapter_1.casting;

public class Shopping {

    public static void main(String[] args) {
	
	Book book = new Book();
	
	// implicit casting - upstream
	Printable printable = book;
	printable.print();
	
	ShoppingItem shoppingItem = book;
	shoppingItem.description();
	
	// won't compile - Printable type doesn't have a method description() !
	// message: error: cannot find symbol
	// printable.description();
	
	// fix to the above - explicit casting
	((Book) printable).description();
	
    }
    
}
