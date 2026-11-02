import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.Comparator;


// stream reduction: max and min
// max(Comparator)
class O5_StreamReductionMaxMinImpl {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(100, 501, 1600, -98, 23, 14);

        Optional<Integer> maxNum = numList.stream()
            .max(Comparator.naturalOrder());
        
        if (maxNum.isPresent()) {
            System.out.println("max num found: " + maxNum.get());
        }

        Optional<Integer> minNum = numList.stream()
            .min(Comparator.naturalOrder());

        if (minNum.isPresent()) {
            System.out.println("min num found: " + minNum.get());
        }
    }
}