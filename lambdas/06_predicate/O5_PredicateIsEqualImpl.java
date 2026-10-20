import java.util.function.Predicate;

// predicate equality check between two objects
// isEqual is a static method unlike others
class O5_PredicateIsEqualImpl {
    public static void main(String[] args) {
        String mainUsername = "admin";
        String currentUsername = "other";

        Predicate<String> checkIfAdmin = Predicate.isEqual(mainUsername);
        boolean testResult1 = checkIfAdmin.test(currentUsername);
        System.out.println("is current username admin: " + testResult1);

        // another example
        String userInput = "Hello";
        Predicate<String> checkIfNull = Predicate.isEqual(null);
        boolean testResult2 = checkIfNull.test(userInput);
        System.out.println("is user input null? : " + testResult2);
    }
}