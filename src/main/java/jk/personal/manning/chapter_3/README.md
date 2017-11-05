
# 3. Object-oriented design principles
  
## 3.1 Interfaces

* The term interface can denote a type or a public interaction between two systems (public methods of a class is its interface) [Example](interfaces/Person.java)
* Interfaces provides a public contract that implementing class must fulfill.


* All methods of an interface are implicitly public and abstract. Variables are implicitly public, static and final (because of that they need to be initialized) [Example](interfaces/Runner.java)
* Instance can be declared using access, non-access modifiers and extended interfaces [Example - all possible components](interfaces/Runner.java)
* An interface cannot extend a class.


* Top-level intrerface can be declared as public or with default access (no modifier). Cannot use other access modifiers [Example](interfaces/MyInterface.java)
* An interface can define inner classes and inner interfaces within.
* Top-level interface may be declared with _abstract_ and _strictfp_ non-access modifiers only. Other modifiers cause the interface to not compile [Example](interfaces/MyInterface.java)
* Nested interface can be defined only with _static_ non-access modifier.


* When a class implements interface, is obliged to fulfill the contract established by this interface (implement the abstract methods) [Example](interfaces/Home.java)
* Class won't compile if any abstract method is not implemented (unless the class is marked abstract).
* A class can define an instance / static variable with the same name as variable defined in the interface [Example](interfaces/Home.java)
* If class implements two or more interfaces with the same method name, only one implementation is required. However, in such situations watch out for interfaces that declares incorrectly overloaded methods (e.g. two interfaces with same-name method, but different return type) - such class won't compile [Example](interfaces/Home2.java)
* When interface extends other interface, it inherits all the methods of it [Example](interfaces/FamilyPGHouse.java)


## 3.2 Class inheritance versus interface inheritance

* A class includes implementation details. An interface does not.
* Class inheritance is better when reusing the implementation provided and when adding additional behavior to already existing class (example - class _Object_ provides a bunch of default implementations; if it would be an interface, all methods implementations should be provided by developers).
* Interface inheritance should be used when a class needs to have multiple separate interfaces (behaviors, roles in the system) [Example](interfaces/MyClass.java). Moreover, it is useful when needs to add a contract to the already existing class (example - introduction of the AutoCloseable interface in Java 7). 
* Derived classes are fragile and can be broken when a base class is changed [Example](interfaces/Lion.java)


### Twist in the Tale 3.1

--> d. (AutoCloseable.close() return type is void)


## 3.3 IS-A and HAS-A relationships in code

* IS-A relationship - in general it's achieved by inheritance. A derived class IS-A type of its base class (up the inheritance tree), including all the interfaces.
* HAS-A relationship - when a class is used to compose other class (is a member).


### Twist in the Tale 3.2

-> a, c


* When it comes about IS-A relationship, Interface IS-A (only other interface).


* HAS-A relationship refers to *instance variable*. Static member cannot be a part of HAS-A relationship.


## 3.4 Cohesion and low coupling

* High cohesion and low coupling are design principles that help in providing reusable, maintainable and in general better code.
* *Cohesion* is a measure how focused on a specific responsibility a class or module is. The higher level of cohesion, the better [Example - low cohesion](cohesion/LowCohesionEditor.java) vs. [Example - high cohesion](cohesion/HighCohesionEditor.java)
* Highly cohesive classes are easier to use and to maintain.
* *Coupling* is a measure how dependant on other classes / modules a specific class or module is.
* If one class uses other class' public interface (public methods), then they are _loosely coupled_ [Example](coupling/LooseCoupledEditor.java) But it the first class can manipulate other's class non-public members, these are _tightly coupled_ [Example](coupling/TighlyCoupledEditor.java)
* Interfaces promote loose coupling (provides a public interface with no access to the implementation details) [Example](coupling/InterfaceAuthor.java)



## 3.5 Object composition principles

* Aside of the inheritance, other very important concept is how to compose your class with an object of another class [Example](composition/Car.java)
* _Composition over inheritance_. Members of an inheritance tree are highly coupled and base class is fragile to changes (can break derived classes). 


## 3.6 Introduction to design patterns

* _Design pattern_ identifies a recurring problem and possible solution to solve it.


## 3.7 Singleton pattern

* Creational design pattern to provide a class that is instantiated once and a global point of access to this class.
* Used when you need the class to have only one instance - when more could cause issues (e.g. one instance of a print spooler).
* How-To Singleton:
1. Define a private constructor
2. Define a private static variable to hold the only instance of Singleton.
3. Define a public static access method (point of access).  
  
[Example - Singleton](singleton/Singleton.java)  
[Example - Use](singleton/UseSingleton.java)


* In multithread environments there is a need to provide an concurrent access and initialization. Ones of the possible solutions to that problem is [eager initialization](singleton/EagerInitializationSingleton.java), [synchronized lazy initialization](singleton/SyncLazyInitializationSingleton.java) or using [enums](singleton/EnumSingleton.java).


### Twist in the Tale 3.3

--> no, a private member and public method should be static


* In the past the _singleton_ behavior used to be implemented with static variables. But this has a set of disadvantages: it does not prevent from creating multiple objects of this type, eager initialization (static variables causes allocation of resources which can sometimes not be used), pollution of the namespace.


## 3.8 Factory pattern

* *Factory pattern* allows to manage the creation of object and to avoid tight coupling between classes.


* *Simple Factory pattern (_Static Factory pattern_)* creates and returns objects of classes that extend a common parent / implement a common interface. 
* In this pattern, class [Client](factory/simple/Client.java) is decoupled from knowing the implementation and the process of creation a specific instance of [App](factory/simple/App.java) interface: [WordProcessor](factory/simple/WordProcessor.java) or [TextEditor](factory/simple/TextEditor.java). The whole process is hidden in [AppFactory](factory/simple/AppFactory.java)


* *Factory Method pattern* lets the subclasses to decide which class (defined as an interface) to instantiate.





































