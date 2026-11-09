### Parallel Stream
- Java 8 also introduced the concepts of parallel stream and parallel processing.

### Creation of parallel stream
- there are two way in which we can create parallel streams:
    1. `parallelStream()` method
    2. `parallel()` method
        - when we already have a stream, we can use parallel() method to convert it into a parallel stream.


### Scenarios where parallel stream is might be useful
- Parallel stream has a lot of overhead compared to a sequential one. 
- Coordinating the threads takes a significant amount of time.
- We should always use serial stream whenever possible first.
- And can consider using parallel stream in following cases:
    1. have large amount of data to process.
    2. have a performance problem in the first place.
    3. All the shared resources between threads need to be synchronized properly otherwise it might produce unexpected results.

### Parallelism important note:
- According to Brian Goetz (Java Language Architect & specialization lead for Lambda Expressions), the following things should be considered before going for parallelization:
    1. Splitting is not more expensive than doing the work.
    2. Task dispatch or management costs between threads is not too high.
    3. The result combination cost must not be too high.
    4. Use the NQ formula to decide if you want to use parallelism.
        ```
        NQ Model:
            N x Q > 10000
        
        where,
        N = number of data items
        Q = amount of work per item
        ```