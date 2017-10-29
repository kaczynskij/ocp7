
# 2. Advanced class design
  
## 2.1 Abstract classes and their application
  
* Abstract class, defined with keyword _abstract_ is a non-instantiable class and is created in order to be extended.
* A first concrete sub-class is obliged to provide implementation to all abstract method up the inheritance tree (from all the parent classes).
* When to use interface instead? Interfaces don't allow to provide implementation of any declared method and allow to define only constants which cannot be reassigned. So exemplary Animal class cannot be changed to interface - its fields needs to be able to be reassigned [Example](animals/Animal.java)
* Java 8 allows to provide default implementation of interdace's methods.


* Abstract class can define a constructor(s). When any is provided, a sub-classess need to call at least one of those constructors.
* There is no requirement to define abstract method in abstract class.
* The abstract class constructor requires all sub-classes to pass a value [Example](animals/Animal.java)
* Derived class constructor must call base class constructor.


### Twist in the Tale 2.1
  
Animal
-> Omnivore
-->
   
-> Carnivore
--> Lion
  
-> Herbivore
--> Deer
--> Elephant
  

* If method is defined as an abstract, a whole class needs to be marked as abstract.


* Abstract classes are used to group a common properties and behaviour of similar objects. At the same time, this abstract class has not enough details to allow to create a fully working object, hence requires to create sub-class.
* There's no sense in creating an abstract class with no implementations.
* The most important aim of abstract class is as above - to force sub-classes to provide implementations of specific mechanisms.


### DOs and DON'Ts

* Abstract class shouldn't be used to prevent creation of objects [Example](dos_and_donts/Math.java)
* When abstract class implements interface, it shouldn't result in ambiguity. Watch out for incorrectly overloaded methods from abstract classes and interfaces [Example](dos_and_donts/Animal.java)
* Reminder: Abstract classes cannot be instantiated!
* Abstract class cannot be marked final. They won't compile.
* When abstract class implements interface, it doesn't need to provide its implementation.


## 2.2 Static and final keyword

* Final class cannot be extended.
* Static variable / method can be accessed without instances of its class.


* As static can be defined: variable, method, nested class, nested interface.
* As static cannot be defined: top-level class, top-level interface, enum (won't compile).
* Static members _belong to the class, not to instance_.


### [Static keyword](static_keyword/Publisher.java)

* Static variable and its value is shared by all instances of specific class. Can be also accessed without an instance.
* Static variable is created when class is loaded into memory by JVM.
* The static variable can be also modified using any instance of the class (not a best practice).
* Static and final modifiers are used when defining a constants [Example](static_keyword/Emp.java)


* Static methods cannot access non-static methods or fields.
* Utility methods can be created as static, to manipulate only the method parameters, not the state (in fact - not a good practice in OOP paradigm; [Utility classes are evil](http://alphawang.com/blog/2014/09/utility-classes-are-evil/), [Util Classes Must Die](http://oo-programming.blogspot.com/2009/06/util-classes-must-die.html) and many, many more across the whole Internet).


* Static methods / variables cannot access non-static ones. The reverse is allowed [Example](static_keyword/MyClass.java)


* Static variables cannot be initialized in constructor, only in static initializer blocks. This block is invoked when a class is loaded into memory by JVM [Example](static_keyword/AffiliateProgram.java)
* There can be multiple static initializer blocks in one class, they are invoked in order.
* When initializing a static variable with a method, the method cannot declare checked exceptions [Example - initAccountOpenBonusWithExc](static_keyword/AffiliateProgram.java)


### Twist in the Tale 2.2

--> d.

[Example](static_keyword/DemoMultipleStaticBlocks.java)


* Static initializer blocks and variable initialization is performed in order of application.


* Top-level class or interface cannot be defined static, but nested can [Example](static_keyword/Person.java)
* In case of nested classes, its static variables and methods can be accessed without the existence of outer class instances.


### [Final keyword](final_keyword) 

* Final is non-access modifier which can be applied to a class, interface, variable or method.
* Final class cannot be subclassed.
* Final method cannot be overriden.
* Final variable cannot be reassigned once initialized. 


* Final variables can be initialized only once.
* A final static class variable can be initialized with declaration or with static init block. It cannot be initialized with static method or in the custructor (won't compile).
* A final instance variable can be initialized in the constructor or instance init block but NOT in an instance method [Example](final_keyword/InstanceFinalVariables.java)


* All final variables (static and instance) needs to be initialized in order the code to compile.
* A local final variable can be uninitialized if it's not used [Example](final_keyword/MyClass.java)


* Method parameters marked final cannot be reassigned.
* Final primitive variable cannot be changed. Final object reference is slightly different. The variable cannot be reassigned, but the object itself can be modified [Example](final_keyword/MyClass.java)


* If the intitialization of final variable is doubtful, the code won't compile [Example](final_keyword/MyClass.java)


### Twist in the Tale 2.3











