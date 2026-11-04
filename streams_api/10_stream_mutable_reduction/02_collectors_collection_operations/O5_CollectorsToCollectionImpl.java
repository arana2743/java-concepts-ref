import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;


// Collectors: toCollection()
class O5_CollectorsToCollectionImpl {
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

        // collect employee names in a LinkedList
        LinkedList<String> empNames = empList.stream()
            .map(emp -> emp.getName())
            .collect(Collectors.toCollection(LinkedList::new));
        
        System.out.println(empNames);

    }
}