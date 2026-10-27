import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;


// instance method reference of an arbitrary object
class O4_InstanceMethodArbitraryObjectReferenceImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Dave", 23, 20000),
            new Employee("Joe", 18, 40000),
            new Employee("Ryan", 54, 100000),
            new Employee("Iyan", 5, 34000),
            new Employee("Ray", 63, 54000)
        );

        // without using method reference
        int totalSalary1 = empList.stream()
            .mapToInt(emp -> emp.getSalary())
            .sum();
        System.out.println("without method ref, total salary: " + totalSalary1);

        // with use of method reference
        int totalSalary2 = empList.stream()
            .mapToInt(Employee::getSalary)
            .sum();
        System.out.println("with method ref, total salary: " + totalSalary2);
    }
}
class Employee {
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}