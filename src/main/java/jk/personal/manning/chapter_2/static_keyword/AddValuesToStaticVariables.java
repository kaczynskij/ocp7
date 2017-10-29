package jk.personal.manning.chapter_2.static_keyword;

public class AddValuesToStaticVariables {

    static private String[] dataStores = new String[5];
    
    static {
	dataStores[0] = "us.ny";
	dataStores[1] = "jp.tk";
	dataStores[2] = "gr.br";
    }
    
}
