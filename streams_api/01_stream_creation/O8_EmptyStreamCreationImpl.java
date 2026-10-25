import java.util.stream.Stream;
import java.util.stream.IntStream;


// Empty Stream creation
// two ways:
// 1. Stream.empty() 
//      - Java 8 
//      - doesn't take any argument and return empty stream
//      - useful when handling intermediate function output
// 2. Stream.ofNullable() 
//      - return either null or object (argument itself if not null)
//      - Java 9
//      - takes one argument (can be null or collection or array)
//      - has internal logic to check if argument is null or not
//      - kind of like soft wrape to handle NULL values
class O8_EmptyStreamCreationImpl {
    public static void main(String[] args) {
        String dummyName;
        // below will throw NullPointerException
        Stream<String> strStream1 = Stream.empty();

        System.out.println("stream 1 with empty() length: " + strStream1.count());

        String name = null;
        Stream<String> strStream2 = Stream.ofNullable(name);
        System.out.println("stream 2 with ofNullable() length: " + strStream2.count());
    }
}