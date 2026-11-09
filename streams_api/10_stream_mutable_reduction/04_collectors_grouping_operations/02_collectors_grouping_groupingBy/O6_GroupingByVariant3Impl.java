import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;


// Collectors groupingBy: variant 3
// which takes classifier, map implementation type
// and downstream collector
// map implementation type is used if we want to 
// collect overall result into a map type of our choice
class O6_GroupingByVariant3Impl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China")
        );

        // grouping employees by country and collect map values into a set
        // and collect overall result into a hashMap
        Map<String, Set<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                HashMap::new,
                Collectors.toSet()
            ));

        System.out.println(empMap);
    }
}