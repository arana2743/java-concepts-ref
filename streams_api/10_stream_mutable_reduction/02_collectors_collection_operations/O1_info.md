### Collectors: Collection Operations
1. Collectors.toList()
    - it returns a Collector that collects all input elements into a new List.
2. Collectors.toSet()
    - it returns a Collector that collects all input elements into a new Set.
3. Collectors.toMap()
    - it returns a Collector that collects all input elements into a new Map.
    - this method takes two paremeters:
        - `keyMapper` - used for extracting a map key from a stream element.
        - `valueMapper` - used for extracting a value associated with a given key.
    - also has below two optional arguments:
        - `BinaryOperator`
            - this is an optional argument
            - helps decide which key to take in case of duplicate keys.
        - `Supplier`
            - help decide collect the map values into Mapper of our type.
4. Collectors.toCollection(Supplier<C> collectionFactory)
    - it returns a Collector that collects all of the input elements into a new Collection.
    - this method takes a supplier as a parmeter. The supplier supplier that collection of our choice.
    - example: collect names of employee object list and then collect them into a new linked list.
        ```
        LinkedList<String> empNames = empList.stream()
            .map(emp -> emp.getName())
            .collect(Collectors.toCollection(LinkedList::new));
        ```
5. Collectors.collectingAndThen(Collector<T,A,R> downstream, FUnction<R,RR> finisher)
    - it returns a Collector that accumulates the input elements into the given Collector and then performs an additional finishing function.
    - example: collecting the elements in a list and then converting the list into an unmodifiable list.
        ```
        List<String> unmodifiableList = currList.stream()
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                Collections::unmodifiableList
            ));
        ```
