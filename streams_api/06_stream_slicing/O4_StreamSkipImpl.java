import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;


// stream slicing: skip()
class O4_StreamSkipImpl {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("original numList:");
        numList.stream()
            .forEach(n -> System.out.print(n + " "));

        System.out.println("\nnumList by skipping first 4 elements:");
        numList.stream()
            .skip(4)
            .forEach(n -> System.out.print(n + " "));
    }
}