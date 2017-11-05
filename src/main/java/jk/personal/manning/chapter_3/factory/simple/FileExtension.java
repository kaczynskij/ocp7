package jk.personal.manning.chapter_3.factory.simple;

public enum FileExtension {

    DOC(".doc"), XML(".xml"), TXT(".txt");
    
    private String extension;
    
    private FileExtension(String fileExt) {
	this.extension = fileExt;
    }
    
    public String getExtension() {
	return extension;
    }
    
}
