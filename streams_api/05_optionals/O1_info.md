### Optionals in Java
- The `Optional<T>` is a wrapper class that stores an object of type `T`. The object may or may not be present in the optional.
- Java 8 **Optional** works as a container type for the value which is probably absent or null.
- Java Optional is a final class present in the java.util package.

#### Benefits of Optional
- Using optional makes the code more readable and less prone to error.
- The benefit of optional is not that we are saved from applying a null check.
- The benefit is that Optional provides us lots of utility method that we can apply to our wrapped objects.

### Different ways of creating an Optional
- There are three different ways of creating an Optional Object:
    1. Using `empty()` method
        - We can create an empty optional using empty() method.
        - The Optional create through empty will contain a null value.
        - example:
            ```
            Optional<Person> person = Optional.empty();
            ```
    2. Using `of()` method
        - We can create an Optional object that has a non-null value using of() method.
        - If we create an optional using the of() method and the value is null, then it will throw a **NULL POINTER EXCEPTION**
        - So when creating optional with of() method, we need to be sure that value is not null.
        - example:
            ```
            Person person = new Person();
            Optional<Person> optional = Optional.of(person);
            ```
    3. Using `ofNullable()` method
        - ofNullable() method is useful when we are not sure if the value is null or not null while creating an optional.
        - If a non-null value is passed in ofNullable() method, then it will return the optional containing the specified value.
        - Otherwise it will return an empty optional.
        - example:
            ```
            Person person = new Person();
            Optional<Person> optional = Optional.OfNullable(person);
            ```

### Various methods available in Optional class
1. isPresent()  
    - used to check if the optional contains a value or if it is null.
    - **returns** true if object contains a non-null value otherwise false.
    - example:
        ```
        Optional<Person> optional = getPerson();
        if (optional.isPresent()) {
            System.out.println(optional.get(getName));
        }
        ```
2. ifPresent(Consumer<? super T> consumer)
    - It takes in a consumer as a parameter and return nothing.
    - if a value is present then specified consumer is invoked with the value. Otherwise, nothing happens.
    - example:
        ```
        Optional<Employee> emp = getEmployeeByID(123);
        emp.ifPresent(System.out::println);
        ```
3. get()
    - this method return a value if present in the optional.
    - Otherwise, it throws **NoSuchElementException**.
    - it is risky to use this method without checking if the value is present or not first.
    - example:
        ```
        Optional<String> optional = Optional.ofNullable(null);
        // this will throw an exception of because optional contains a null value
        System.out.println(optional.get());
        ```
4. orElse(T other)
    - this method the value present in the optional. 
    - if no value is present, then a default value provided as parameter is returned.
    - example:
        ```
        Optional<String> optional = Optional.ofNullable(null);
        // this will return the default value
        System.out.println(optional.orElse("default string"));
        ```
5. orElseGet(Supplier<? extends T> other)
    - This method returns the value present in the optional. 
    - If no value is present, then the value calculated from the supplier provided as a parameter is returned.
    - example:
        ```
        Optiona<String> optional = Optional.ofNullable(null);
        // this will return the default value returned by function in supplier
        System.out.println(optional.orElseGet(getDefaultValueMethod()));
        ```
6. orElseThrow(Supplier<? extends T> other)
    - This method returns the value present in the optional.
    - If no value is present, then it throws the exception created by the provided supplier in the argument.
    - example:
        ```
        Optional<String> optional = Optional.ofNullable(null);
        // this will throw exception
        try{
            optional.orElseThrow(() -> {
                new Exception("Resource not found");
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        ```
7. Optional<T> filter(Predicate<? super T> predicate)
    - This method is used to check if the value in our optional matches a particular condition.
    - if yes, then the optional with the value is returned.
    - otherwise, an empty optional is returned.
    - example:
        ```
        Optional<String> optional = Optional.ofNullable("orange");
        // below will match filter condition and return optional value
        System.out.println(optional.filter(str -> str.equals("orange")));
        // below will not match filter condition and return empty optional
        System.out.println(optional.filter(str -> str.equals("apple")));
        ```
8. map(Function<? super T, ? extends U> mapper)
    - if a value is present, then apply the provided mapping function to it, wrap the result in a new optional and then return it.
    - otherwise, ignore the mapping function and return an empty optional.
    - example:
        ```
        Optional<String> optional1 = Optional.of("John");
        // below will print the uppercase JOHN
        optional1.map(str -> str.toUpperCase())
            .ifPresent(System.out::println);
        // below will print nothing since map will return empty optional
        Optional<String> optional2 = Optional.ofNullable(null);
        optional2.map(str -> str.toUpperCase())
            .ifPresent(System.out::println);
        ```
9. flatMap(Function<? super T, Optional<U>> mapper)
    - Similar to map() method, we also have flatMap() method as an alternative for transforming values.
    - The difference is that the map() transfroms values only when they are unwrapped, whereas flatMap() takes a wrapped value and unwraps it before transforming it.
    - example:
        ```
        // emp.getSalary method
        public Optiona<Integer> getSalary() {
            // here salary is wrapped once before returning
            return Optional.of(salary);
        }
        // with map
        Optional<Optional<Integer>> opt1 = optional.map(emp -> emp.getSalary());

        // with flatMap
        Optiona<Integer> opt2 = optiona.flatMap(emp -> emp.getSalary());
        ```
