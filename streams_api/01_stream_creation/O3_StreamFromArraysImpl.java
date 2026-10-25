import java.util.Arrays;
import java.util.stream.Stream;


// Stream creation from arrays
// especially useful for primtive type arrays
class O3_StreamFromArraysImpl {
    public static void main(String[] args) {
        String[] namesArray = {"John", "Tom", "James"};
        Stream<String> namesStream = Arrays.stream(namesArray);
    }
}