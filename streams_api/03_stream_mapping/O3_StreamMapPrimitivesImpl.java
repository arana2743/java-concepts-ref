import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;
import java.util.PrimitiveIterator;


// primtives mapping for a stream
class O3_StreamMapPrimitivesImpl {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Johnson", "duke", "MAVERICK", "DuDdLeY");
        System.out.println(namesList);

        IntStream namesLengthStream = namesList.stream()
            .mapToInt(n -> n.length());
        
        PrimitiveIterator.OfInt intIterator = namesLengthStream.iterator();
        while(intIterator.hasNext()) {
            System.out.print(intIterator.nextInt() + "  ");
        }
        System.out.println();
    }
}