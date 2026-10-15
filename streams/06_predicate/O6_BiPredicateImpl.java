import java.util.function.BiPredicate;

// unlike Predicate which takes one argument to test
// BiPredicate takes two arguments to test
class O6_BiPredicateImpl {
    public static void main(String[] args) {
        int tomAge = 17;
        int votingAge = 18;
        BiPredicate<Integer, Integer> ifEligibleToVote = (p,q) -> p > q;
        boolean testResult = ifEligibleToVote.test(tomAge, votingAge);

        System.out.println("is elgible to vote with bi-predicate: " + testResult);
    }
}