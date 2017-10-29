package jk.personal.manning.chapter_2.static_keyword;

public class Publisher {

    public static void main(String[] args) {
	
	System.out.println(Book.getBookCount());
	Book b1 = new Book();
	Book b2 = new Book();
	System.out.println(Book.getBookCount());
	
	// it used to be visible
	// b1.bookCount = 10;
	System.out.println(Book.getBookCount());
	
    }
    
}
