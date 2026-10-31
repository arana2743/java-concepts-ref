### Matching operations in Stream
- Matching operations are terminal operations.
- Used to check if elements with certain cirteria are present in the stream or not.

### Matching operations methods:
1. anyMatch()
    - it takes a predicate as input and returns:
        - `true` if at least one element matches the criteria
        - `false` if no element matches the criteria
        - `false` if the stream is empty
2. allMatch()
    - it takes a predicate as input and returns:
        - `true` if all elements match the criteria
        - `true` if the stream is empty
        - `false` if even a single element does not match the criteria
3. noneMatch()
    - it takes a predicate as input and returns:
        - `true` if no elements of the stream match
        - `true` if the stream is empty
        - `false` if even a single element matches the criteria
