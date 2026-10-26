import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;


// flatMap() to flatten stream
class O4_StreamFlatMapImpl {
    public static void main(String[] args) {
        List<List<String>> strMatrix = Arrays.asList(
            Arrays.asList("a", "b", "c", "d"),
            Arrays.asList("e", "a", "f", "g"),
            Arrays.asList("h", "i", "a", "j"),
            Arrays.asList("k", "l", "m", "a")
        );
        System.out.println(strMatrix);

        String strTest = "a";
        Stream<String> filterStream = strMatrix.stream()
            .flatMap(x -> x.stream())
            .filter(x -> x.equals(strTest));

        Iterator<String> iterator = filterStream.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}