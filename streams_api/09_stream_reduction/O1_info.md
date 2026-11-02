### Reduction operations in Stream
- Reduction operations in stream allow the stream to be reduced into a single value.
- These operations are immutable operations since they reduce the result into a single valued immutable variable.
- For example, given a collection of objects, we may need to get sum of all elements, the max element, or any other operation which us a single value as a result. This can be achieved through reduction operations.
- The immutable reducation is achieved through `reduce()` method.


#### Key concepts in reduction operations
1. Identity
    - an element that is the initial value of the reduction operation, and they default result if the stream is empty.
2. Accumulator
    - a function that takes two parameters:
        - first, a partial result of the reduction operation
        - second, the next element of the stream
3. Combiner
    - a function used to combine the partial result of the reduction operation when:
        - the reduction is parallelized.
        - or there's mismatch between the types of the accumulator arguments and the types of the accumulator implementation.


### Reduction method reduce() versions:
1. Optional<T> reduce(BinaryOperator<T> accumulator)
    - This method takes a binary operator as an input and returns an optional that describes the reduced value.
    - The reduce() method iteratively applies the accumulator function on the current input element.
    - example like finding total salary of all employees.
        ```
        Optional<Integer> totalSalary = empList.stream()
            .map(emp -> empl.getSalary())
            .reduce((p,q) -> p + q);
        ```
2. T reduce(T identity, BinaryOperator<T> accumulator)
    - This method has an extra **identity** parameter. It is the initial value of reduction. It is also the default value of reduction if there are no elements in the stream.
    - That's the reason, this version of reduce() method doesn't return an Optional since it would at-least return the identity element.
    - example same as earlier of finding total salary of all employees.
        ```
        int totalSalary = empList.stream()
            .map(emp -> emp.getSalary())
            .reduce(0, (p,q) -> p + q);
        ```
3. <U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)
    - This method performs a reduction of the elements of the stream, using provided identity, accumulation and combining functions.
    - when using parallel stream, the Java runtime splits the stream into multiple sub-streams. 
    - In such cases, we need to use a function to combine the results of the sub-streams into a single one. That part is done by a combiner.
    - example same of total salary of employees but doing this time in parallel stream:
        ```
        int totalSalary = empList.parallelStream()
            .map(emp -> emp.getSalary())
            .reduce(0, (p, q) -> p + q, Integer::sum);
        ```
4. max() and min()
    - max() and min() operations are very useful if we need to get the largest or smallest element of a stream.
    - syntax:
        ```
        Optional<T> max(Comparator<? super T> comparator)
        ```
    - it takes a **Comparator** and returns an **Optional**.
    
        