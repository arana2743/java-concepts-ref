class FunctionalInterfaceImpl {
    public static void main(String[] args) {
        Greeting hindiGreeting = new HindiGreeting();
        hindiGreeting.greet();
        Greeting englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
    }
}
class HindiGreeting implements Greeting {
    @Override
    public void greet(){
        System.out.println("Namaste!");
    }
}

class EnglishGreeting implements Greeting {
    @Override
    public void greet(){
        System.out.println("Hello!");
    }
}

@FunctionalInterface
interface Greeting {
    void greet();
}