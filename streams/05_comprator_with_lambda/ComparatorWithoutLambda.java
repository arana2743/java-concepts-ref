import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


// first comparator without use of lambda
class ComparatorWithoutLambda {
    public static List<Person> getPersonDataList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John" , 23 , "USA"));
        persons.add(new Person("Carl" , 23 , "Australia"));
        persons.add(new Person("Amit" , 23 , "India"));
        persons.add(new Person("Vikram" , 23 , "Bhutan"));
        persons.add(new Person("Kane" , 23 , "Brazil"));
        return persons;
    }
    // sort the list by name in ascending order of name
    public static List<Person> sortPersonsByName(List<Person> personsList) {
        Collections.sort(personsList, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.getName().compareTo(p2.getName());
            }
        });
        return personsList;
    }

    public static void main(String[] args) {
        List<Person> personsList = getPersonDataList();
        System.out.print("Initial persons list: ");
        for (final Person person : personsList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();

        List<Person> sortedPersonsList = sortPersonsByName(personsList);
        System.out.print("sorted list: ");
        for (final Person person : sortedPersonsList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();
        System.out.print("original list: ");
        for (final Person person : personsList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();
    }
}