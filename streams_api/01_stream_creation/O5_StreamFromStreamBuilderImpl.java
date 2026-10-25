import java.util.stream.Stream;
import java.util.Iterator;


// Stream creation from Stream Builder
// method : Stream.builder()
// useful when we want to add elements
// one-by-one before processing
class O5_StreamFromStreamBuilderImpl {
    public static void main(String[] args) {
        Stream.Builder<String> streamBuilder = Stream.builder();

        // adding elements to the stream
        Stream<String> stream = streamBuilder.add("A")
            .add("B")
            .add("C")
            .add("D")
            .build();
        
        Iterator<String> iterator = stream.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }
}