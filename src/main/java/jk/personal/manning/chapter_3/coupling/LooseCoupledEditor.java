package jk.personal.manning.chapter_3.coupling;

public class LooseCoupledEditor {

    public void clearEditingDoubts(Author author) {
	setUpCall(author.skypeID); // tight coupling
	converse(author);
    }
    
    void setUpCall(String skypeId) {}
    void converse(Author author) {}
    
}
