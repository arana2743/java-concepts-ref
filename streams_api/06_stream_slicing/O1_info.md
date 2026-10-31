### Slicing operations in stream
- The slicing operations are intermediate operations.
- They are used to slice a stream.

### Slicing operation methods
1. distinct()
    - it returns a stream consisting of distinct elements of the stream.
    - comparison for distinction happens according to `Object.equals(Object)`.
2. limit()
    - it returns a stream consisting of the elements of the stream, truncated to be no longer than **maxSize** in length which is passed as argument.
3. skip()
    - it returns a stream consisting of the remaining elements of the stream after discarding the first n elements of the stream.
    - n elements to skip is passed as argument to the method.
