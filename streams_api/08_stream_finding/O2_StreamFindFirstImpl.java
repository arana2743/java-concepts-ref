import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.Arrays;


// finding: findFirst()
class O2_StreamFindFirstImpl {
    public static void main(String[] args) {
        List<Person> personsList = Arrays.asList(
            new Person("Dave", 23,"India"),
            new Person("Joe", 18,"USA"),
            new Person("Ryan", 54,"Canada"),
            new Person("Iyan", 5,"India"),
            new Person("Ray", 63,"China")
        );

        Optional<Person> person = personsList.stream()
            .filter(p -> p.getCountry().equals("India"))
            .findFirst();
        
        if (person.isPresent()) {
            System.out.println(person);
        }
    }
}

class Person {
    String name;
    int age;
    String country;

    Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }

}