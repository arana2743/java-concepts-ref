class LambdaExpressionImpl {
    public static void main(String[] args) {
        Greeting hindiGreeting = () -> {
            System.out.println("Namaste!");
            
        };
        hindiGreeting.greet();

        // if lambda is single line then can skip curly braces as well
        Greeting englishGreeting = () -> System.out.println("Hello!");
        englishGreeting.greet();
    }
}


@FunctionalInterface
interface Greeting {
    void greet();
}