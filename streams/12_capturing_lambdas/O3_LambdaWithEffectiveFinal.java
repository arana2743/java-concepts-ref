import java.util.function.UnaryOperator;


// this will produce no error since
// local variable will remain "effectively final"
class O3_LambdaWithEffectiveFinal {
    public static void main(String[] args) {
        int i = 10;
        // since local variable i remained unchanged
        // so it became effectively final
        // and able to use in lambda
        UnaryOperator<Integer> operator = (input) -> input * i;
        
        int result = operator.apply(10);
        // result should be 100
        System.out.println("result: " + result);
    }
}