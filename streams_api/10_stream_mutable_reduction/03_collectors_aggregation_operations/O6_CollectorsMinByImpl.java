import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;


// Collectors aggregation: minBy()
class O6_CollectorsMinByImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000),
            new Employee("Ben", 63, 25000),
            new Employee("Dave", 34, 56000),
            new Employee("Jodi", 43, 67000),
            new Employee("Ryan", 53, 54000)
        );

        // get employee with minimum salary
        Optional<Employee> minSalaryEmp = empList.stream()
            .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

        if (minSalaryEmp.isPresent()) {
            System.out.println("Minimum salary employee: " + minSalaryEmp.get());
        }
    }
}