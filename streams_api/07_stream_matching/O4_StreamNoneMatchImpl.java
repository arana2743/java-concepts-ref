import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;


// matching operations: noneMatch()
class O4_StreamNoneMatchImpl {
    public static void main(String[] args) {
        List<Person> personsList = Arrays.asList(
            new Person("Dave", 23,"India"),
            new Person("Joe", 18,"USA"),
            new Person("Ryan", 54,"Canada"),
            new Person("Raju", 5,"India"),
            new Person("Ray", 63,"China")
        );

        boolean anyRussian = personsList.stream()
            .noneMatch(p -> p.getCountry().equals("Russia"));

        System.out.println("are there no residents of Russia: " + anyRussian);
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

}