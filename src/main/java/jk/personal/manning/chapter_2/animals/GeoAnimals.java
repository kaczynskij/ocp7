package jk.personal.manning.chapter_2.animals;

public class GeoAnimals {

    Animal[] animals = new Animal[3];
    
    public GeoAnimals() {
	animals[0] = new Lion("Antelope", 20);
	animals[1] = new Elephant("Bananas", 60);
	animals[2] = new Tiger("Zebra", 20, true);
    }
    
    void flashcards() {
	for(Animal animal : animals) {
	    animal.eat();
	    animal.live();
	}
    }
    
    public static void main(String[] args) {
	GeoAnimals geoAnimals = new GeoAnimals();
	geoAnimals.flashcards();
    }
    
}
