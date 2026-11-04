import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


// Collectors: toMap()
class O4_CollectorsToMapImpl {
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

        // collect empName and nameLength as key,value pairs in map
        Map<String, Integer> nameLengthMap = empList.stream()
            .map(emp -> emp.getName())
            .distinct()
            .collect(Collectors.toMap(s -> s, s -> s.length()));

        System.out.println(nameLengthMap);

        // another way to handle duplicates in by adding another parameter
        // toMap() takes one more optional argument
        // BinaryOperator which is used to decide which element to take
        // in case of duplicates
        Map<String,Integer> nameLengthMap2 = empList.stream()
            .map(emp -> emp.getName())
            .collect(Collectors.toMap(s -> s, s -> s.length(), (s1,s2) -> s1));
        System.out.println(nameLengthMap2);
    }
}