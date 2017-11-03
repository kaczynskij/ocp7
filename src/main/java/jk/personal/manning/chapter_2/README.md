
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

--> won't compile


* Final method cannot be overriden. If one try to override final method, it won't compile.
* One can override only inherited members, so final but private method in derived class can seem to be overriden [Example](final_keyword/Base.java)


* Classes marked as final cannot be extended.
* Keywords final and abstract cannot be used together.


## 2.3 Enumerated types

* Enum is a data type which defines a finite set of objects. One cannot create own, new enum objects, just use existing and defined ones - enum has a fixed set of constants [Example](enums/GameApp.java)
* Enums are implicitly declared final.
* By default a set of methods, fields and private constructor is added to every enum.

### Twist in the Tale 2.4

--> a.


* All enums extends java.lang.Enum class - so if one try to set the custom enum to extend other class - it won't compile. It can implement any interface, however [Example](enums/Person.java)
* The default order of enums is the order of definition, not alphabetical [Example](enums/TestEnum.java)
* Any member of a class can be added to enum (variables, constructors, methods...). Constants list must be first statement in enum definition [Example](enums/IceCream.java)
* Semicolon is mandatory at the end of enum list only, if there is additional custom member.
* Each enum can also have overriden specific methods [Example](enums/IceCream.java)
* One can add a custom constructor to enum, the constructor can have a default or private access modifier.
* If one define a constant-specific class body with additional method, it cannot be accessed in fact [Example](enums/UseIceCream.java)
* Enum can be defined as top-level type or as a member of a class / interface. Cannot be a local member [Example](enums/MyClass.java)
* Enum can define an abstract method, but it must be overriden it in all enum constants.


### Twist in the Tale 2.5

--> c.


## 2.4 Static nested and inner classes

* One class can be a member of another class - so called nested classes. They can be static (nested class) or non-static (inner class).
* Nested / inner classes, like top-level ones, can define variables and members.
* Inner classes can be defined within methods and without a name.


* *Static nested class* is a member of its enclosing class and can access all static members of its outer class.
* *Inner class* is an instance member, it can access all the instance and static members, including private ones.
* *Method local inner class* is defined inside a method and can access all members of outer class. including private ones.
* *Anonymous inner class* - a local class without a name.
* Inner classes are useful to encapsulate a part of the functionality that is immanently bound to the outer class.


* Static nested class can exists without the instance of its outer class. It can be referred like a static member of a class.
* Static nested class is initialized when it's loaded with outer class in memory.
* Access to nested class can be restricted by using access modifiers.
* From within the outer class, nested class can be instantiated without prefixing. But from outside, it always needs a prefix OuterClass.InnerClass [Example](nested/Outer.java)
* Available access levels for SNC: all. The accessibility of inner class depends on the accessibility of outer class.
* A static nested class can access only a static members of outer class.


* Inner class is an instance member of outer class, hence it cannot exists without outer class instance [Example](inner/Tree.java)
* Any access modifier is available for inner class, it can also define constructors, variables, methods. CANNOT define non-final static variables or methods [Example](inner/Outer.java)
* Inner class can be created: as an instance member, within a method of an outer class, withing a static method of an outer class and outside the outer class [Example](inner/Outer.java)
* To create an instance of inner class, a new keyword needs to be used: outerObject.new Inner()  [Example](inner/Foo.java)
* Inner class, as a member of outer class, can access all its members.
* Keyword this in inner class refers to the inner class instance. To reach to the outer class - Outer.this [Example](inner/Outer.java)


### Twist in the Tale 2.6

--> e.


* Anonymous inner class is an inner class defined without explicit name and is used mainly when one needs to override method of a class for only one, particular instance without defining a new class.
* The anonymous class can override none, few or all methods of the inherited class or all methods of the implemented interface.
* A new object created with use of anonymous inner class can be assigned to any type of variable (static, instance, local, method parameter or returned from a method) [Example](anonymous/Lecture.java)
* Anonymous classes can be used to provide implementation of an interface [Example](anonymous/BirdSanctuary.java)
* However, anonymous inner class can extend one class or implement one interface.


* Method local inner classes are defined in the body of a method (static or instance).
* Java compiler creates a separate class fine for each method inner class and inner class name can be the same for every method.
* MLIC itself CANNOT be defined with any access modifier. However, it CAN define ctor, variable and method using any of access level modifier. 
* No static members for method local inner class.
* An object of MLIC can be created only within a method it's defined [Example](anonymous/Outer.java)
* MLIC can access all variables and methods of the outer class (incl. private and inherited ones). They can be referred using the name of outer class by using Outer.this [Example](anonymous/Outer.java) 


