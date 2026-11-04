import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


// Collectors aggregation: counting()
class O2_CollectorsCountingImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000),
            new Employee("Ben", 63, 25000),
            new Employee("Dave", 34, 56000),
            new Employee("Jodi", 43, 67000),
            new Employee("Ryan", 53, 54000)
        );

        // counting() method to get employee count
        // who are above age of 30
        long empCount = empList.stream()
            .filter(emp -> emp.getAge() > 30)
            .collect(Collectors.counting());
        System.out.println("Employee count above age of 30: " + empCount);
    }
}

