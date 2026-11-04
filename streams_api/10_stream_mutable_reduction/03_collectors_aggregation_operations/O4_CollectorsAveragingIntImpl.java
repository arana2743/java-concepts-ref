import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


// Collectors aggregation: averagingInt()
class O4_CollectorsAveragingIntImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000),
            new Employee("Ben", 63, 25000),
            new Employee("Dave", 34, 56000),
            new Employee("Jodi", 43, 67000),
            new Employee("Ryan", 53, 54000)
        );

        // average salary of all employees
        double averageSalary = empList.stream()
            .collect(Collectors.averagingInt(Employee::getSalary));

        System.out.println("Average salary of employees: " + averageSalary);
    }
}