import java.util.function.UnaryOperator;


// unary operator is similar to Function 
// with difference that it takes
// one argument of type T and 
// returns the value of same type T.
// has abstract method apply()
class O1_UnaryOperatorImpl {
    public static void main(String[] args) {
        UnaryOperator<Integer> squareNum = p -> p * p;
        int squareResult = squareNum.apply(25);
        System.out.println("squareResult: " + squareResult);
    }
}