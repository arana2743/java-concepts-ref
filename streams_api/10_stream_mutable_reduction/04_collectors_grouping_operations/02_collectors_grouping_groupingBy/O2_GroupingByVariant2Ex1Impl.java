import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;


// Collectors groupingBy: variant 2
// which takes classifier and downstream collector (for map values)
// example 1: 
// which just collects map values into 
// a given downstream collector
class O2_GroupingByVariant2Ex1Impl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China")
        );

        // grouping employees by country
        // and this time collect the map values to a set
        Map<String, Set<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                Collectors.toSet()
        ));

        System.out.println(empMap);
    }
}