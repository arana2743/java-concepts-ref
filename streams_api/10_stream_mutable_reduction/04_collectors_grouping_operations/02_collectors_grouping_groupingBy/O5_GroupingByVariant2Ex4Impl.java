import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;


// Collectors groupingBy: Variant 2
// which takes classifier and downstream collector(for map values)
// example 4:
// get a map where key is the name of country and 
// value is name of employee with maximum salary for that country
// this can be done with maxBy() as downstream collector
class O5_GroupingByVariant2Ex4Impl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China")
        );

        // group employees country and get maximum salary employee 
        // from each grouped country
        Map<String, Optional<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                Collectors.maxBy(
                    Comparator.comparingInt(Employee::getSalary)
                )
            ));
        
        System.out.println(empMap);
    }
}