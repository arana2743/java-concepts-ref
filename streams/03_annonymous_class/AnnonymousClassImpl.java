// annonymous classes make functional interface implementation
// more concise and easy to read
class AnnonymousClassImpl {
    public static void main(String[] args) {
        Greeting hindiGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Namaste!");
            }
        };
        hindiGreeting.greet();
    }
}

@FunctionalInterface
interface Greeting {
    void greet();
}