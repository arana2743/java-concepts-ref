// import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;


// stream reduction: way two
// T reduce(T identity, BinaryOperator<T> accumulator)
class O3_StreamReductionWayTwoImpl {
    public static void main(String[] args) {
        List<Integer> first10NumList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int first10NumsTotal = first10NumList.stream()
            .reduce(0, (partialValue, num) -> partialValue + num);
        
        System.out.println("Total of first 10 natural numbers: " + first10NumsTotal);
    }
}