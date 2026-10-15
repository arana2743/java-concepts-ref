import java.util.function.Predicate;

// predicate has logical Operation like OR
// wherein you can club two or more predicate results 
class O3_PredicateOrImpl {
    public static void main(String[] args) {
        int tomAge = 15;
        Predicate<Integer> lessThan18 = p -> p < 18;
        Predicate<Integer> greaterThan60 = p -> p < 60;
        Predicate<Integer> nonWorkingAge = lessThan18.or(greaterThan60);
        boolean testResult = nonWorkingAge.test(tomAge);
        System.out.println("Does tom fall under non working category(less than 18 or greater than 60): " + testResult);
    }
}