## Filtering operations in Stream
- The filtering operations filters the given stream and returns a new stream, which only contains those elements that are required for the next operation.

### filter() method
- The **Stream** interface has `filter()` method to filter a stream.
- This is an intermediate operation.
- Filter method takes a Predicate as argument which is applied to each element.
    ```
    Stream filter(Predicate<?super T> predicate)
    ```
