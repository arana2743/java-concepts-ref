import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Comparator;


// Collectors aggregation: maxBy
class O7_CollectorsMaxByImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000),
            new Employee("Ben", 63, 25000),
            new Employee("Dave", 34, 56000),
            new Employee("Jodi", 43, 67000),
            new Employee("Ryan", 53, 54000)
        );

        // employee with maximum salary
        Optional<Employee> maxSalaryEmp = empList.stream()
            .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        
        if (maxSalaryEmp.isPresent()) {
            System.out.println("Employee with maximum salary: " + maxSalaryEmp.get());
        }
    }
}