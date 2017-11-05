package jk.personal.manning.chapter_3.coupling;

public interface InterfaceAuthor {

    String getSkypeID();

}

class TechnicalAuthor implements InterfaceAuthor {

    String name;
    String skypeName;

    @Override
    public String getSkypeID() {
	return this.skypeName;
    }

}

class Editor {

    public void clearEditingDoubts(InterfaceAuthor author) {
	setUpCall(author.getSkypeID()); // interface allows only to work with
					// public members (methods)
	converse(author);
    }

    void setUpCall(String skypeID) {
    }

    void converse(InterfaceAuthor author) {
    }

}