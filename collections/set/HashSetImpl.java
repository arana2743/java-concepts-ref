import java.util.Set;
import java.util.HashSet;


class HashSetImpl {
    public static void main(String[] args) {
        Set<String> keySet = new HashSet<>();
        System.out.println("Hash set size: " + keySet.size());
        keySet.add("Tom");
        keySet.add("Dick");
        keySet.add("Bruce");
        keySet.add("Dick");
        System.out.println("Hash set size: " + keySet.size());
        System.out.println("Hash set: " + keySet);

    }
}