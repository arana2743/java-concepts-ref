### Collectors: Aggregation Operations
1. counting()
    - it returns a Collector that counts the number of the input elements.
2. joining()
    - it returns a Collector that concatenates the input elements into a String, in the encountering order.
    - it also has few overloaded versions that allow us to provide delimiters, prefix and suffix strings.
3. Collectors.summingInt(ToIntFunction<? super T> mapper)
    - it returns a Collector that produces the sum of an Integer valued function applied to the input elements.
    - example: to get sum of salaries of employees with summingInt()
        ```
        int count = empList.stream()
            .collect(Collectors.summingInt(emp -> emp.getSalary()));
        ```
4. Collectors.averagingInt(ToIntFunction<? super T> mapper)
    - it returns a Collector that produces the arithematic mean of an integer-valued function applied to the input elements.
    - it no elements are present, then result is 0.
    - this method takes a `ToIntFunction` as a parameter.
    - example: to get the average salary with averagingInt()
        ```
        double average = empList.stream()
            .collect(Collectors.averagingInt(emp -> emp.getSalary()));
        ```
5. minBy(Comparator<? super T> comparator)
    - it returns a Collector that returns the minimum element based on the given comparator.
    - The returned value is wrapped in an Optional instance, to handle when stream is empty.
    - example: find minimum salary employee with minBy()
        ```
        Optional<Employee> empMinSal = empList.stream()
            .collect(Collectors.minBy(
                Comparator.comparing(Employee::getSalary)
        ));
        ```
6. maxBy(Comparator<? super T> comparator)
    - it returns a Collector that returns the maximum element based on the given comparator.
    - the returned value is wrapped in an Optional instance, to handle when stream is empty.
    - example: find maximum salary employee with maxBy()
        ```
        Optional<Employee> empMaxSal = empList.stream()
            .collect(Collectors.maxBy(
                Comparator.comparing(Employee::getSalary)
            ));
        ```
7. summarizingInt(ToIntFunction<? super T> mapper)
    - it returns a Collector that applies an int-producing mapping function to each input element and returns summary statistics for the resulting values.
    - return value type is `java.util.IntSummaryStatistics`.
    - example:
        ```
        IntSummaryStatistics summerizingInt = Stream.of("1", "2", "3")
            .collect(Collectors.summarizingInt(Integer::parseInt));
        ```