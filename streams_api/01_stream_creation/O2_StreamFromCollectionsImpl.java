import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;


// Stream creation from Collections
// such as List, Map
class O2_StreamFromCollectionsImpl {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5);
        Stream<Integer> numStream = numList.stream();

    }
}