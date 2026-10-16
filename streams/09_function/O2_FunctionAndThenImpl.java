import java.util.function.Function;

// andThen() is default method
// which allows to chain two or more function
// returns a composed function that applies 
// the first function on which it is called on input
// then applies the function provided as parameter
// hint: resolves function from left to right 
class O2_FunctionAndThenImpl {
    public static void main(String[] args) {
        Function<Integer, Integer> incrementBy10 = x -> x + 10;
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;

        int finalResult = incrementBy10.andThen(multiplyBy2).apply(3);
        // answer should be 26
        // since incrementBy10 is applied first then multiplyBy3
        System.out.println(finalResult);
    }
}