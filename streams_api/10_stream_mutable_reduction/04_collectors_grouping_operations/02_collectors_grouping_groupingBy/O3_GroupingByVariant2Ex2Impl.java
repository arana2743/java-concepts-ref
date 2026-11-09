import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


// Collectors groupingBy: variant 2
// which takes classifier and downstream collector (for map values)
// example 2: 
// using downstream collector
// to group on multiple conditions
class O3_GroupingByVariant2Ex2Impl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China")
        );

        // group employees based on country and age
        Map<String, Map<Integer, List<Employee>>> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                Collectors.groupingBy(Employee::getAge)
            ));
        
        System.out.println(empMap);
    }
}