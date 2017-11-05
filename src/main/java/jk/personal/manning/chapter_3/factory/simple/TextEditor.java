package jk.personal.manning.chapter_3.factory.simple;

public class TextEditor implements App {

    @Override
    public void open(String filename) {
	System.out.println("Launch TextEditor using " + filename);
    }

}
