## Capturing Lambdas
A lambda expression is said to be capturing if it either accesses instance variables of it's enclosing class or local variables (final or effectively final) from it's enclosing scope.

A lambda expression can capture the three types of variables given below:
- static variables
- instance variables
- local variables (final or effectively final)

Note: If a lambda expression captures a local variable then the variable should be either **final** or **effectively final**.

### What is effectively final?
- Effectively final is a new concept that was introduced in Java 8.
- A non-final, local variable whose value is never changed after initialization is know as effectively final.
- Before Java 8, we cannot use a non-final, local variable in an anonymous class. If you need to access a local variable in an anonymous class, then it should be declared as **final**.
- This restriction is relaxed in Java 8. Now the compiler, itself can check if the value of a variable is not changed after the assignment. Then, it is **effectively final**.


### Why should local variables be final or effectively final?
- When a local variable is used in lambda expression, the lambda makes a copy of that variable.
- This occurs because the scope of a lambda expression is only until the method is in the stack. If the lambda does not make a copy of the local variable, then the variable is lost after the method is removed from the stack.
- Now, if the variable is not final or effectively final, it is possible that the value of the local variable is changed after using it in lambda expression.
