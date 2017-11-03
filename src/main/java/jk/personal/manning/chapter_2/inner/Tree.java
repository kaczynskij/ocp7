package jk.personal.manning.chapter_2.inner;

class Node {
    Object value;
    Node left, right;
}

class Tree {

    Tree() { }
    Node rootNode;
    
    void addElement(Object value) {
	
    }
    
    void removeElement(Object value) {
	
    }
    
    void sortTree(boolean ascending) {
	new TreeSort(ascending).sort();
    }
    
    class TreeSort {
	boolean ascendingSortOrder = true;
	public TreeSort(boolean order) {
	    this.ascendingSortOrder = order;
	}
	void sort() {
	    
	}
    }
    
}
