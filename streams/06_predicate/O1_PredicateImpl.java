import java.util.function.Predicate;


class O1_PredicateImpl {
    public static void main(String[] args) {
        int tomAge = 15;
        Predicate<Integer> testVotingAge = p -> p > 18;
        boolean tomVotingAgeTest = testVotingAge.test(tomAge);
        System.out.println("Is tom eligible for voting: " + tomVotingAgeTest);
    }
}