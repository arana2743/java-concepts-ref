import java.util.stream.IntStream;
import java.util.stream.Stream;


// slicing operation: limit()
class O3_StreamLimitImpl {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 5);
        System.out.println("using limit printing first 11 elements of infinite stream:");
        infiniteStream.limit(11)
            .forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}