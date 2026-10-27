import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;


// instance method reference
class O3_InstanceMethodImpl {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("done", "word", "practice", "fake", "that");

        CustomClass obj = new CustomClass();

        // without instance method reference
        wordsList.stream()
            .map(str -> obj.getLength(str))
            .forEach(System.out::println);

        // with instance method reference
        System.out.println("with instance method reference");
        wordsList.stream()
            .map(obj::getLength)
            .forEach(System.out::println);
    }
}
class CustomClass {
    public int getLength(String str) {
        if (str == null) return -1;
        return str.length();
    }
}