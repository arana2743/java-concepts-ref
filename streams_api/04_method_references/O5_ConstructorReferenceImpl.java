import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;


// constructor reference in stream
class O5_ConstructorReferenceImpl {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Dave", "Joe", "Ryan", "Iyan", "Ray");

        // without constructor reference
        namesList.stream()
            .map(name -> new Employee(name))
            .forEach(System.out::println);

        // with constructor reference
        System.out.println("With constructor reference");
        namesList.stream()
            .map(Employee::new)
            .forEach(System.out::println);
    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name) {
        this.name = name;
    }

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