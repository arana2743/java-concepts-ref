import java.util.function.Consumer;


// andThen() is a default method
// which allows to chain two or more consumers
class O2_ConsumerAndThenImpl {
    public static void main(String[] args) {
        Consumer<String> sayGreeting = p -> System.out.println(p + ", Good morning!");
        Consumer<String> sayTask = p -> System.out.println(p + ", have 10 tasks today!");

        sayGreeting.andThen(sayTask).accept("John");
    }
}