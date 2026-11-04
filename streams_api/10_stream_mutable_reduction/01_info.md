### Mutable reduction operations in stream
- The mutable reductions collect the desired results into mutable container objects, such as a `java.util.Collection` or an `array`.
- The mutable reduction is achieved through the `collect()` method. It is one of the Java 8 Stream API's **terminal methods**.

### Implemetation of collect() method:
1. `collect(Collector<? super T,A,R> collector)`
    - this version uses the predefined implementations provided by the **Collectors** class
2. `<R> R collect(Supplier<R> supplier, BiConsumer<R, ? supper T> accumulator, BiConsumer<R, R> combiner)`
    - the version allows to create our own Collector implementation.


### Collectors class
- **Collectors** is a final class that extends the object class.
- It provides the most commong mutable reduction operations that could be required as individual static methods.
- Some of the important reduction operations already implemented in the `Collectors` class are listed below:

| Collector Method | Purpose |
| :--- | :--- |
| `toList()` | Collects stream elements into a `List`. |
| `toSet()` | Collects stream elements into a `Set`. |
| `toMap()` | Returns a Collector that accumulates elements into a `Map` whose keys and values are the result of applying the provided mapping functions to the input elements. |
| `collectingAndThen()` | Collects stream elements and then transforms them using a `Function`. |
| `summingDouble()`, `summingLong()`, `summingInt()` | Sums-up stream elements after mapping them to a Double/Long/Integer value using a specific type `Function`. |
| `reducing()` | Reduces elements of the stream based on the provided `BinaryOperator` function. |
| `partitioningBy()` | Partitions stream elements into a `Map` based on the provided `Predicate`. |
| `counting()` | Counts the number of stream elements. |
| `groupingBy()` | Produces a `Map` of elements grouped by the provided grouping criteria. |
| `mapping()` | Applies a mapping operation to all stream elements being collected. |
| `joining()` | Concatenates stream elements into a single `String`. |
| `minBy()` / `maxBy()` | Finds the minimum/maximum of all stream elements based on the provided `Comparator`. |

### Collectors classification
- we can further divide Collectors class method into below groups
    - Collectors: Collection Operations
    - Collectors: Aggregate Operations
    - Collectors: Grouping Operations