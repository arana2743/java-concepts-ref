import java.util.function.Consumer;


// consumer is a functional interface
// that takes a parameter and returns nothing
// has absract method accept()
class O1_ConsumerImpl {
    public static void main(String[] args) {
        Consumer<String> printString = p -> System.out.println(p);
        printString.accept("Hello World of Consumer.");
    }
}