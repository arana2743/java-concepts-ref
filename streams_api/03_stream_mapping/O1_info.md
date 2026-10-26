### Mapping Operations in Stream
- Mapping operations are those operations that transform the elements of a stream and return new stream with transformed elements.
- We can use variety of methods to transform a stream into another object. Two most common methods used are:
    1. `map()`
    2. `flatMap()`

### map() method
- The `map()` method takes a lambda expression of type **Function** as argument and uses it to change every individual element in the stream.
    ```
    <R> Stream map(Function<? super T, ? extends R> mapper)
    ```
- It returns a new stream object containing changed elements.

#### For primtives map() method
- For primitives there are available map() method versions as below:
    - mapToInt()
    - mapToLong()
    - mapToDouble()

### flatMap() method
- The `flatMap()` method is used to flatten a stream of collections to a stream of elements combined from all collections.
- Basically, `flatMap()` is used to the following:
    - `Stream<String[]> -> flatMap -> Stream<String>`
    - `Stream<Set<String>> -> flatMap -> Stream<String>`
    - `Stream<List<String>> -> flatMap -> Stream<String>`

#### Requirement for flatMap() method
- The main reason for flatMap() requirement or to flatten the stream is that intermediate operations such as **filter()** and **distinct()** do not work on stream of collections.
- These method only work on stream of primitives or objects. So, we need to flatten our stream before using intermediate operations.


#### For primitives flatMap() method
- Similar to **map()** method, **flatMap()** method also has primtive variations. These are:
    - flatMapToInt()
    - flatMapToLong()
    - flatMapToDouble()
