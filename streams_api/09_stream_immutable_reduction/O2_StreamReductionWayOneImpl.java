import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;


// stream reduction: way one
// with just accumulator as input
// Optional<T> reduce(BinaryOperator<T> accumulator)
class O2_StreamReductionWayOneImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Dave", 23,20000),
            new Employee("Joe", 18,40000),
            new Employee("Ryan", 54,100000),
            new Employee("Iyan", 5,34000),
            new Employee("Ray", 63,54000)
        );

        // get totalSalary
        Optional<Integer> totalSalary = empList.stream()
            .map(emp -> emp.getSalary())
            .reduce((partialValue, currEmp) -> partialValue + currEmp);
        
        if (totalSalary.isPresent()) {
            System.out.println("total salary: " + totalSalary.get());
        }
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