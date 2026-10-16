import java.util.function.BiConsumer;


// biconsumer is similar to consumer
// with difference being that it 
// accepts two arguments 
class O3_BiConsumerImpl {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addTwoNums = (p,q) -> System.out.println(p + q);
        addTwoNums.accept(10, 20);
    }
}