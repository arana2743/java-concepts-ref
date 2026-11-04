import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


// Collectors: toList()
class O2_CollectorsToListImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Alex" , 23, 23000, "USA"),
            new Employee("Ben" , 63, 25000, "India"),
            new Employee("Dave" , 34, 56000, "Bhutan"),
            new Employee("Alex" , 23, 23000, "USA"),
            new Employee("Jodi" , 43, 67000, "China"),
            new Employee("Dave" , 34, 56000, "Bhutan"),
            new Employee("Ryan" , 53, 54000, "Libya")
        );

        // get a list of employee name in a list
        List<String> empNames = empList.stream()
            .map(emp -> emp.getName())
            .collect(Collectors.toList());

        System.out.println(empNames);
    }
}