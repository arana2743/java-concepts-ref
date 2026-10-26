import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


// filtering applied to custom objects in Stream
class O3_StreamFilterObjectsImpl {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23));
        list.add(new Person("Joe", 18));
        list.add(new Person("Ryan", 54));
        list.add(new Person("Iyan", 5));
        list.add(new Person("Ray", 63));

        Stream<Person> personsStream = list.stream();

        // filter those person whose age is between 18 and 60
        Stream<Person> workingPersonFilter = personsStream.filter(
            ((person) -> person.getAge() > 18 && person.getAge() < 60)
        );

        Iterator<Person> iterator = workingPersonFilter.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}