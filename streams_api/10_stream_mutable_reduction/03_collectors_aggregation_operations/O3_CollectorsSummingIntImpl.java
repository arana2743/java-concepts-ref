import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


// Collectors aggregation: summingInt()
class O3_CollectorsSummingIntImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000),
            new Employee("Ben", 63, 25000),
            new Employee("Dave", 34, 56000),
            new Employee("Jodi", 43, 67000),
            new Employee("Ryan", 53, 54000)
        );

        // total salary of all employees
        long totalSalary = empList.stream()
            .collect(Collectors.summingInt(Employee::getSalary));

        System.out.println("total salary of all employees: " + totalSalary);
    }
}