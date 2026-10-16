import java.util.function.BiFunction;


// bi-function is similar to function
// with difference being that
// takes two objects of type T,U as arguments
// and returns an object of type R
class O4_BiFunctionImpl {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addTwoNums = (x,y) -> x + y;
        int result = addTwoNums.apply(10,20);
        System.out.println(result);
    }
}