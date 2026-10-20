import java.util.function.Function;


// compose() is default method
// it behaves exactly opposite of andThen()
// i.e., returns a composed function that applies
// the function provided as parameter on the input
// and then applies the function on which it is called upon
// hint: resolves function from right to left
class O3_FunctionComposeImpl {
    public static void main(String[] args) {
        Function<Integer, Integer> incrementBy10 = x -> x + 10;
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;

        int finalResult = incrementBy10.compose(multiplyBy2).apply(3);
        // answer should be 16
        // since multiplyBy2 gets applied first then incrementBy10
        System.out.println(finalResult);
    }
}