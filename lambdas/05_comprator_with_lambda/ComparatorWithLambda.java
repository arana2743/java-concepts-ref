import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


class ComparatorWithLambda {
    public static void main(String[] args) {
        List<Person> personsList = getPersonDataList();
        System.out.print("Initial persons list: ");
        for (final Person person : personsList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();
        sortPersonsByName(personsList);
        System.out.print("sorted list: ");
        for (final Person person : personsList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();
    }

    public static void sortPersonsByName(List<Person> personsList) {
        Collections.sort(personsList, 
            (p1,p2) -> p1.getName().compareTo(p2.getName())
        );
    }
    public static List<Person> getPersonDataList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John" , 23 , "USA"));
        persons.add(new Person("Carl" , 23 , "Australia"));
        persons.add(new Person("Amit" , 23 , "India"));
        persons.add(new Person("Vikram" , 23 , "Bhutan"));
        persons.add(new Person("Kane" , 23 , "Brazil"));
        return persons;
    }
}