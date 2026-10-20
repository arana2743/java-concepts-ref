import java.util.function.UnaryOperator;


// below class will produce an error
class O2_LambdaWithoutEffectiveFinal {
    public static void main(String[] args) {
        int i=10;
        // given we will be change value of i here
        // so it will no longer will effectively final
        i = 20;
        UnaryOperator<Integer> operator = (input) -> input * i;
        // error: local variables referenced from a lambda expression must be final or effectively final
        
        int result = operator.apply(10);
        System.out.println("result: " + result);
    }
}