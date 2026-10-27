import java.util.List;
import java.util.Arrays;


// method reference type: static method reference
class O2_StaticMethodReferenceImpl {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("done", "word", "practice", "fake");

        // without static method reference
        wordsList.stream()
            .mapToInt(str -> CustomClass.getLength(str))
            .forEach(str -> System.out.println(str));

        // with static method reference
        System.out.println("with static method reference:");
        wordsList.stream()
            .mapToInt(CustomClass::getLength)
            .forEach(System.out::println);
        
    }
}

class CustomClass {
    public static int getLength(String str) {
        if (str == null) {
            return -1;
        }
        return str.length();
    }
}