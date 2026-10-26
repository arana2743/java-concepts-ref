import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;


// mapping method in stream
class O2_StreamMapImpl {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Johnson", "duke", "MAVERICK", "DuDdLeY");

        Stream<String> namesUpperStream = namesList.stream()
            .map(n -> n.toUpperCase());
        
        Iterator<String> iterator = namesUpperStream.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
    }
}