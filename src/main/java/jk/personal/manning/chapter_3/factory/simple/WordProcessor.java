package jk.personal.manning.chapter_3.factory.simple;

public class WordProcessor implements App {

    @Override
    public void open(String filename) {
	System.out.println("Launch WordProcessor using " + filename);
    }

}
