import java.util.List;
import java.util.Arrays;


// stream reduction: way three
// <U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)
class O4_StreamReductionWayThreeImpl {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int numTotal = numList.parallelStream()
            .reduce(0, (n1,n2) -> n1 + n2, Integer::sum);

        System.out.println("sum of first 10 natural numbers(parallel): " + numTotal);
    }
}