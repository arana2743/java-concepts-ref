import java.util.stream.Stream;


// Stream comparison 
// parallel vs serial streams
class O2_StreamComparisonImpl {
    public static void main(String[] args) {
        // serial stream
        System.out.println("--------------- Serial Stream ----------------");
        Stream.of(1,2,3,4,5,6,7)
            .forEach(
                num -> System.out.println(num + " " + Thread.currentThread().getName())
            );
        
        // parallel stream
        System.out.println("--------------- Parallel Stream ---------------");
        Stream.of(1,2,3,4,5,6,7)
            .parallel()
            .forEach(
                num -> System.out.println(num + " " + Thread.currentThread().getName())
            );
    }
}