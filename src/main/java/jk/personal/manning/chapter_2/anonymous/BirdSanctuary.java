package jk.personal.manning.chapter_2.anonymous;

interface Flyable {
    void fly();
}

public class BirdSanctuary {

    Flyable bird = new Flyable() {
        
        @Override
        public void fly() {
            System.out.println("Flying high in the sky");
        }
    };
    
}
