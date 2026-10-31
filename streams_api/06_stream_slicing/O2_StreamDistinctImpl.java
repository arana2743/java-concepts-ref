import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;


// slicing operation: distinct()
class O2_StreamDistinctImpl {
    public static void main(String[] args) {
        List<String> countriesList = Arrays.asList(
            "India",
            "USA",
            "China",
            "India",
            "UK",
            "China"
        );

        System.out.println("Countries list before distinct:");
        countriesList.stream()
            .forEach(c -> System.out.print(c + " "));
        System.out.println();
        
        System.out.println("Countries list before distinct:");
        countriesList.stream()
            .distinct()
            .forEach(c -> System.out.print(c + " "));

        System.out.println();
    }
}