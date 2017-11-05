package jk.personal.manning.chapter_3.coupling;

public class TightlyCoupledEditor {

    public void clearEditingDoubts(Author author) {
	setUpCall(author.getSkypeID()); // low coupling
	converse(author);
    }
    
    void setUpCall(String skypeId) {}
    void converse(Author author) {}
    
}
