import java.util.stream.Stream;
import java.util.Iterator;


// simple filter applied on a stream
class O2_StreamFilterImpl {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(1, (x) -> x + 1);

        // now filter for first 10 odd numbers
        Stream<Integer> first10OddNums = infiniteStream.filter(x -> x % 2 != 0)
            .limit(10);
        
        Iterator<Integer> iterator = first10OddNums.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}