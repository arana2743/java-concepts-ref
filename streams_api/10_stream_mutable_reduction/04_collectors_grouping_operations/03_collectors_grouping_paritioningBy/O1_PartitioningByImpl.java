import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


// Collectors partitioningBy()
// takes a predicate as argument,
// allows to partition elements into two groups true and false
// true will contain list of elements 
// which passed the predicate condition
// and false will contain rest of elements
class O1_PartitioningByImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex", 23, 23000, "USA"),
            new Employee("Ben", 63, 25000, "China"),
            new Employee("Dave", 34, 56000, "India"),
            new Employee("Jodi", 43, 67000, "USA"),
            new Employee("Ryan", 53, 54000, "China"),
            new Employee("John", 30, 54000, "India")
        );

        // group the employees by age less than 30 and more than 30
        Map<Boolean, List<Employee>> empMap = empList.stream()
            .collect(Collectors.partitioningBy(
                emp -> emp.getAge() > 30
            ));
        
        System.out.println(empMap);
    }
}