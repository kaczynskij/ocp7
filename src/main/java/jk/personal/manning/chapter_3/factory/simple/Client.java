package jk.personal.manning.chapter_3.factory.simple;

public class Client {

    public static void main(String[] args) {
	
	App app = AppFactory.getAppInstance(FileExtension.DOC);
	app.open("Hello.doc");
	
	App app2 = AppFactory.getAppInstance(FileExtension.XML);
	app2.open("Hello.xml");
	
    }
    
}
