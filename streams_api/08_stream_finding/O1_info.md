### Finding operations in Stream
- The fiding operations are used when we need to get the matched element instead of just verifying if it is present or not.
- These operations are typically used with a filter() operation, but it is not necessary that they are used only with a filter() operation.

### Finding operations methods
1. findFirst()
    - it returns an Optional describing the first element of the stream, or an empty optional if the stream is empty.
2. findAny()
    - It returns an Optional describing some elements of the stream, or an empty optional if the stream is empty.
    - This method is particularly useful in the case of parallel streams.
    - Now if we use the findFirst() method in parallel stream, it can be very slow. Instead, findAny() is used if we are not concerned about which element is returned.