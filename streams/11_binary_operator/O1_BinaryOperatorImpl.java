import java.util.function.BinaryOperator;


// BinaryOperator is similar to BiFunction
// with difference that it takes
// two arguments of type T and
// returns the value of same type T
// has abstract method apply()
class O1_BinaryOperatorImpl {
    public static void main(String[] args) {
        BinaryOperator<String> concatStrings = (s1, s2) -> s1 + s2;
        String finalResult = concatStrings.apply("Hello", "Boomer");
        System.out.println(finalResult);
    }
}