## Streams API
- The addition of Streams API was one of the major features added to Java 8.

### What is a stream in Java?
- A stream in Java can be defined as a sequence of elements from a source that supports aggregate operations on them.
- The source here refers to collections or arrays that provide data to stream.

### Few important points about stream in Java:
- A stream is not a data structure itself. It is a bunch of operations applied to a source. The source can be collections, arrays or I/O channels.
- Streams don't change the original data source.
- There can be zero or more intermediate operations that transform a stream into another stream.
- Each intermediate operation is lazily executed.
- Terminal operations produce the result of the stream.

### Stream creation
- Stream creation is done in below most common ways:
    1. From Collections
    2. From Arrays
    3. From individual values i.e., Stream.of()
    4. From primitive and numeric ranges i.e., IntStream, LongSteam, DoubleStream
    5. From a stream builder
    6. Create infinite stream with Stream.generate()
    7. Empty stream with 
        - Stream.empty()
            - Java 8 
            - doesn't take any argument and return empty stream
            - useful when handling intermediate function output
        - Stream.ofNullable()
            - returns either null or object (argument itself if not null)
            - Java 9+
            - takes one argument (can be null or collection or array)- has internal logic to check if argument is null or not - kind of like soft wrape to handle NULL values


### Stream Interfaces
- The stream API defines a few interfaces such as `Stream`, `IntStream`, `LongStream`, `DoubleStream`, etc,.
- The `Stream<T>` interface is for objects elements. For primitives, it defines `IntStream`, `LongStream`, `DoubleStream`.
- **Note:**
    - It is a good practice to use primitive streams if you are dealing with primitives because wrapping primitives to objects and auto-boxing is a costly process.


### Stream Intermediate Operations
- These methods do not produce any results.
- They usually accept interfaces as parameters and always return a new stream.
- Some of the intermediate operations are:
    - filter()
    - map()


### Stream Terminal Operations
- These methods produce some results.
- Some of the terminal operations methods are :
    - count()
    - toArray()
    - collect()


### These methods can be further classified as:
- filtering (intermediate)
- slicing (intermediate)
- mapping (intermediate)
- matching and finding (terminal)
- reduction (terminal)
- collect (terminal)