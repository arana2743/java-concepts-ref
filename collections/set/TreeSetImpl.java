import java.util.Set;
import java.util.TreeSet;


// A HashSet will store elements in natural sorted order
class TreeSetImpl {
    public static void main(String[] args) {
        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(1);
        treeSet1.add(9);
        treeSet1.add(5);
        treeSet1.add(3);
        // will store and pring values in sorted order (asc by default)
        System.out.println("tree set : " + treeSet1);

        // clear a tree set
        treeSet1.clear();
        System.out.println("tree set : " + treeSet1);
    }
}