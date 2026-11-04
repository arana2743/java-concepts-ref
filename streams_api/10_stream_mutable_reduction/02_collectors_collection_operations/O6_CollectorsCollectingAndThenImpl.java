import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;


// Collectors: collectingAndThen()
class O6_CollectorsCollectingAndThenImpl {
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


        // collecting here in a list and then 
        // making the resulting list to unmodifiable-list
        List<String> unmodifiableList = empList.stream()
            .map(emp -> emp.getName())
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                Collections::unmodifiableList
        ));

        System.out.println(unmodifiableList);

    }
}