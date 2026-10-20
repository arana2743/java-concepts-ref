import java.util.function.Supplier;


// supplier is functional interface 
// that does not take any argument
// but produces a value when get() is invoked.
// also supplier doesn't have any static or default methods
class O1_SupplierImpl {
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = () -> 10;
        Supplier<String> supplier2 = () -> "Done";

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
    }
}