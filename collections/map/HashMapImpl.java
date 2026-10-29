import java.util.Map;
import java.util.HashMap;


// Map interface implement with HashMap
// has key,value pair and cannot have duplcate key entry
class HashMapImpl {
    public static void main(String[] args) {
        Map<Character, Integer> charCount = new HashMap<>();
        System.out.println("hash map : " + charCount);
        System.out.println("size of hashmap : " + charCount.size());
        charCount.put('A', 1);
        charCount.put('B', 2);
        charCount.put('C', 3);
        System.out.println("hash map : " + charCount);
        System.out.println("size of hashmap : " + charCount.size());
        
        // get a value by looking up with key
        int data = charCount.get('C');
        System.out.println("value of char C is: " + data);

        // get a default when key is not present
        int dataOrDefault = charCount.getOrDefault('D', -1);
        System.out.println("value of char D is : " + dataOrDefault);

        // remove a key,value pair by key
        charCount.remove('B');
        System.out.println("hash map : " + charCount);

        // clear the hashmap
        charCount.clear();
        System.out.println("hash map : " + charCount);
        System.out.println("size of hashmap : " + charCount.size());
    }
}