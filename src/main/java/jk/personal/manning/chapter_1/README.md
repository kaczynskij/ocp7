  
// ..
  
## 1.5 Casting
  
* Casting down the hierarchy is done implicitly, only up needs to be explicit.
* Method that are available on the object depends on the declared type (type of the reference).
* Explicit casting - necessary when the compiler doesn't know that the variable is of specific type.
  
* Reference variable can be assigned to a reference variable of the same type, its parent classes and the implemented interfaces. [Example](casting/UpcastWithImplicitCasting.java)
* Reference variable CANNOT be assigned to a reference variable of sub-type [Example](casting/implicit/DowncastWithImplicitCasting)
  
* Upcasting can be done implicitly or explicitly and are allowed.
* Programming to an interface - upcasting - is being encouraged.
* Explicit casting - only on the inheritance line (except interfaces - any non-final class can be explicitly casted to any interface type).
* If explicit casting fails, a ClassCastException is thrown. No such exception when casting implicitly.
  
* Non-final class can be explicitly casted to any interface. Final class cannot - it can only to the interfaces it implements [Example](casting/explicit/Factory.java)
* Remember: String is a final class, so cannot be cast to any interface it does not implement!
* Null can be explicitly casted to any type without compilation error nor ClassCastException! [Example](casting/NullCast.java)
  
* Cast to a type outside inheritance tree - compiler error. Cast to a type within its inheritance tree, but which does not match at runtime - ClassCastException.
  
* The instanceof operator tests whether a variable at runtime holds an object of specific type. Explicit casting should be done only after successful test.
* Note: instanceof returns false if the variable is null! [Example](instanceof_operator/InstanceOfNull.java)
* When using instanceof - types needs to be convertible (one type has to have a possibility to be other type) [Example](instanceof_operator/TestInstanceof.java)
* The instanceof never throws runtime exception. It returns true, false or (when using inconvertible types or right side is null) won't compile.
* Left side of instanceof operator - a value (literal/variable). Rigth side - a class, interface or enum name. Left side can be null, right side cannot.
  
  
## 1.6 Packages(packages_and_import)
  
* Packages group a related set of enums, classes and interfaces. They are also a namespace substitution.
* When in a class there's no package statement, it is considered a default package. Package statement should be a first statement in a class. Only comments can precede.
* A fully qualified name contains a package prefixing a name.
  
* When classes are imported, they can be referenced with a simple name.
* Nevertheless, in the code one can use fully qualified names to refer to a specific type.
  
* Classes in java.lang are automatically imported to any class, interface or enum!
* One cannot use import statement for classes with the same names! One can be imported, but others should be referred using fully-qualified names [Example](packages_and_imports/MultipleClassesWithSameName.java) [Example2](packages_and_imports/AnnualExam.java)
  
* One can use a wildcard character to import all of the PUBLIC MEMBERS of a package (packages_and_imports/AnnualExam.java)
* Import with wildcard imports only the public members (classes, interfaces) and cannot be used to import members of sub-packages.
  
* There is no possibility to import classes from a default package.
* However, a members of default package imports each other automatically.
  
* Static import allows to import static member of a class (or all its static members) [Example](packages_and_imports/AnnualExam.java)
* Syntax: import static, but a common name is static import. 
  

