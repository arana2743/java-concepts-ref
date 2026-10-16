import java.util.function.Function;


// Function is a functional interface
// that takes object of type T as argument
// and returns object of type R
// has abstract method apply()
// ==============================================
// Until now all functional interfaces are:
// either have not taken any argument i.e., supplier
// or have not returned anything i.e., consumer
// or have any returned a boolean i.e., predicate
// ==============================================
class O1_FunctionImpl {
    public static void main(String[] args) {
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("John"));
    }
}