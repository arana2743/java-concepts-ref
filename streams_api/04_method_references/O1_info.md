### Method references
- Method references, as name suggests are references to a method. They are similar to object references. As we can have reference to an object, we can have reference to a method as well.
- Similar to object reference, we can now pass behaviour as parameters.

### Method references vs Lambdas
- There is no difference between method references and lambdas.
- Just that method references are **shortened** versions of lambda expressions that call a specific method.


### Types of method references
- There are four kinds of method references:
    1. Static methods
        - The syntax to use static method reference is `ClassName::MethodName`.
    2. Instance method of a particular object
        - The syntax to use the instance method as method reference is `ReferenceVariable::MethodName`.
    3. Instance method of an arbitrary object
        - This type of method reference does not require the object of the referenced class.
        - We can directly use the class name in the method reference.
        - syntax is `ClassName::MethodName`
    4. Constructor references
        - We can refer to constructor reference in same way we reference a static method.
        - The only difference is that we need to use a `new` keyword.
        - syntax is `ClassName::new`.
