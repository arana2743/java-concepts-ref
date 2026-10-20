import java.util.function.Predicate;


// predicate has logical Operation like NOT
// wherein you can club two or more predicate results 
class O4_PredicateNegateImpl {
    public static void main(String[] args) {
        int tomAge = 17;
        Predicate<Integer> greaterThan18 = p -> p > 18;
        Predicate<Integer> lessThan18 = greaterThan18.negate();
        boolean testResult = lessThan18.test(tomAge);
        System.out.println("less than 18 with negate result: " + testResult);
    }
}