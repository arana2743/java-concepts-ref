import java.util.function.Predicate;

// predicate has logical Operation like AND
// wherein you can club two or more predicate results 
class O2_PredicateAndImpl {
    public static void main(String[] args) {
        int tomAge = 25;
        Predicate<Integer> greaterThan18 = p -> p > 18;
        Predicate<Integer> lessThan60 = p -> p < 60;
        Predicate<Integer> isWorkingAge = greaterThan18.and(lessThan60);
        
        boolean testResult = isWorkingAge.test(tomAge);
        System.out.println("is tom of working age (between 18 and 60): " + testResult);
    }
}