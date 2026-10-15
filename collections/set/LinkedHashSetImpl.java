import java.util.Set;
import java.util.LinkedHashSet;

// A LinkedHashSet maintains the order of inserts of elements
class LinkedHashSetImpl {
    public static void main(String[] args) {
        Set<String> keywordSet = new LinkedHashSet<>();
        System.out.println("Linked hash set: " + keywordSet);
        keywordSet.add("Java");
        keywordSet.add("Cobol");
        keywordSet.add("Rust");
        keywordSet.add("Zig");
        System.out.println("Linked hash set: " + keywordSet);

        // clear the linkedHashSet
        keywordSet.clear();
        System.out.println("Linked hash set: " + keywordSet);
    }
}