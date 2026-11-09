import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;


// Collectors groupingByConcurrent()
// similar to groupingBy with one difference:
// that it returns a ConcurrentMap instead of Map
class O1_GroupingByConcurrentImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China")
        );

        // group employees by country 
        // but here we use groupingByConcurrent
        ConcurrentMap<String, List<Employee>> empMap = empList.parallelStream()
            .collect(Collectors.groupingByConcurrent(
                Employee::getCountry
            ));
        
        System.out.println(empMap);
    }
}