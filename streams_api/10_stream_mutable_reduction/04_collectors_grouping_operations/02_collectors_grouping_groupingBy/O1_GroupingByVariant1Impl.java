import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


// Collectors groupingBy: variant 1
// which takes only classifier as parameter
class O1_GroupingByVariant1Impl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China")
        );

        // group the employees by country
        Map<String, List<Employee>> empMap = empList.stream()
            .collect(Collectors.groupingBy(Employee::getCountry));
        
        System.out.println(empMap);
    }
}