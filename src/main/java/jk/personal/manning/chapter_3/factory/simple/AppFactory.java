package jk.personal.manning.chapter_3.factory.simple;

public class AppFactory {

    public static App getAppInstance(FileExtension fileExtension) {
	if (FileExtension.DOC.equals(fileExtension)) {
	    return new WordProcessor();
	} else if (FileExtension.TXT.equals(fileExtension)
		|| FileExtension.XML.equals(fileExtension)) {
	    return new TextEditor();
	} else {
	    return null;
	}
    }

}
