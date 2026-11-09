### Collectors: Grouping Operations
1. Collectors.groupingBy()
    - this method groups the input elements according to the supplied classifier and returns the results in a `Map`.
2. Collectors.partitionBy()
    - this method parititions the input element according to the supllied Predicate and return a `Map<Boolean, List<T>>`.
    - Since the key is a boolean it only takes two values.
    - Under the true key, we will find elements that match the given predicate.
    - under the false key, we will find the elements which don't match the given predicate.
    - example: partition the list of Employee objects that have an age greater than 30 and less than 30.
        ```
        Map<Boolean, List<Employee>> empMap = empList.stream()
            .collect(Collectors.paritioningBy(
                emp -> emp.getAge() -> 30
            ));
        ```

### Overloaded versions of Collectors.groupingBy() method
1. groupingBy(Function<? super T, ? extends K> classifier)
    - this method takes only an instance of a Function interface as a parameter.
    - example: group the Employee objects based on countries of residence.
        ```
        Map<String, List<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry
        ));
        ```
2. groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)
    - this method takes an additional second collector, which is applied to the results of the first collector.
    - example: group the Employee objects based on their country of residence and collect them into value of Set (from earlier default of value of List).
        ```
        Map<String, Set<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry, 
                Collectors.toSet()
        ));
        ```
    - another way this can be used is when we want to group on multiple conditions. Then we can provide another groupingBy() as downstream.
    - example: group the Employee objects by country and age.
        ```
        Map<String, Map<Integer, List<Employee>>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                Collectors.groupingBy(Employee::getAge)
            ));
        ```
    - another example can be: to fetch a map where key is the name of the country and value is the sum of salaries of all employees of that country - which can be done with summingInt() for salary sum as downstream collector.
        ```
        Map<String, Integer> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                Collectors.summingInt(Employee::getSalary)
        ));
        ```
    - example 4 can be : we need to find maximum salary employee for each country. can be done with maxBy() as the downstream collector.
        ```
        Map<String, Optional<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                Collectors.maxBy(Employee::getSalary)
        ));
        ```
3. groupingBy(Function<? super T,? extends K> classifier, Supplier<M> mapFactor, Collector<? super T,A,D> downstream)
    - the third variant of groupingBy() takes a supplier as an additional parameter.
    - this is used when we need to provide the implementation of the `map` we need.
    - example: to collect employee grouping by country and storing value in set , we can define to collect overall result in a hashMap.
        ```
        Map<String, Set<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                HashMap::new,
                Collectors.toSet()
            ));
        ```
4. groupingByConcurrent(Function<? super T,? extends K> classifier)
    - this variant is similar to groupingBy() collector.
    - the only difference is that this method returns an instance of `ConcurrentMap`.
    - this collector also has 3 overloaded methods that takes the exact same arguments as the respective overloaded methods of the groupingBy Collector.
    - example: group the Employee objects based on country of residence
        ```
        ConcurrentMap<String, List<Employee>> empMap = empList.parallelStream()
            .collect(Collectors.groupingByConcurrent(Employee::getCountry));
        ```