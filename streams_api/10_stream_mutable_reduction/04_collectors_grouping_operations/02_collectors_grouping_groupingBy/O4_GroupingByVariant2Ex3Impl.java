import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


// Collectors groupingBy: variant 3
// which takes classifier and downstream collector (for map values)
// example 3:
// get a map where key is name of country and value is sum of salaries 
// of all employees of that country 
// with summingInt() as downstream collector 
class O4_GroupingByVariant2Ex3Impl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China")
        );

        // group employees by country and get total salaries for 
        // all employees for each country
        Map<String, Integer> empMap = empList.stream()
            .collect(Collectors.groupingBy(
                Employee::getCountry,
                Collectors.summingInt(Employee::getSalary)
            ));
        
        System.out.println(empMap);
    }
}