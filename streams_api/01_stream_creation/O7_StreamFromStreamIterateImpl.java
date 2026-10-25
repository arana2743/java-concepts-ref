import java.util.stream.Stream;
import java.util.Iterator;


// Stream creation with Stream.iterate()
// this takes a seed value(starting value)
// and unaryOperator for control next sequence value
// generates a infinite sequence 
// has option to place a starting value
// that allows to start the sequence
class O7_StreamFromStreamIterateImpl {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(10, (x) -> x + 5)
            .limit(5);
        
        Iterator<Integer> iterator = stream.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}