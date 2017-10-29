package jk.personal.manning.chapter_2.dos_and_donts;

abstract class Herbivore { }

class Deer extends Herbivore { }

public class Forest {
    Herbivore animal = new Deer();
}
