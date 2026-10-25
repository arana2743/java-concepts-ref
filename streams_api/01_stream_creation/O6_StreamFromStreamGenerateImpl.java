import java.util.stream.Stream;
import java.util.stream.DoubleStream;
import java.util.PrimitiveIterator;


// Stream creation using Stream.generate()
// used to generate infinite stream
// accepts a supplier for generating elements
// and resulting stream is infinite
class O6_StreamFromStreamGenerateImpl {
    public static void main(String[] args) {
        // this will keep generating numbers
        Stream<Integer> infiniteStream = Stream.generate(() -> 1);

        // another example 
        // wherein we have added limit for generation
        // with help of limit()
        DoubleStream infiniteStreamFirst5 = DoubleStream.generate(() -> Math.random())
            .limit(5);
        
        PrimitiveIterator.OfDouble doubleIterator = infiniteStreamFirst5.iterator();

        while(doubleIterator.hasNext()) {
            System.out.print(doubleIterator.nextDouble() + "  ");
        }
        System.out.println();

    }
}