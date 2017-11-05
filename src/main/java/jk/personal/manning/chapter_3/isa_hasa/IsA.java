package jk.personal.manning.chapter_3.isa_hasa;


interface Movable {}
interface Hunter extends Movable {}

class Animal implements Movable {}
class Herbivore extends Animal {}
class Carnivore extends Animal implements Hunter {}

class Cow extends Herbivore {}
class Goat extends Herbivore {}

class Lion extends Carnivore {}
class Tiger extends Carnivore {}



public class IsA {

}
