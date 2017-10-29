package jk.personal.manning.chapter_2.static_keyword;

public class Book {

    private static int bookCount;
    
    public Book() {
	incrementBookCount();
    }
    
    public static int getBookCount() {
	return bookCount;
    }
    
    public void incrementBookCount() {
	++bookCount;
    }
    
}
