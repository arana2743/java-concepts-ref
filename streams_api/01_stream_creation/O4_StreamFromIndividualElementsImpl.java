import java.util.stream.Stream;
import java.util.Iterator;

// Stream creation from individual elements
// with help of method Stream.of()
// note: we can also pass an Array in Stream.of()
class O4_StreamFromIndividualElementsImpl {
    public static void main(String[] args) {
        Stream<Integer> valueStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Iterator<Integer> iterator = valueStream.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}