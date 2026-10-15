import java.util.List;
import java.util.ArrayList;


// List interface implementation with ArrayList
// can contain duplicate elements and has indexing of elements
class ArrayListImpl {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(5);
        System.out.println(arr1.size());
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        System.out.println(arr1.size());
        arr1.add(10);
        System.out.println("List are: " + arr1);

        // remove an element by index
        arr1.remove(1);
        System.out.println("List are: " + arr1);

        // clear the entire arrayList
        arr1.clear();
        System.out.println("List are: " + arr1);
        System.out.println("Size of list: " + arr1.size());
    }
}