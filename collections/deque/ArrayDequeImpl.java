import java.util.Deque;
import java.util.ArrayDeque;

// Deque is queue which allows both side entry & exit of elements
// ArrayDeque is one of implementations of Deque interface
class ArrayDequeImpl {
    public static void main(String[] args){
        Deque<Integer> arrayDeque1 = new ArrayDeque<>();
        System.out.println("Array deque : " + arrayDeque1);
        arrayDeque1.add(10);
        arrayDeque1.add(5);
        arrayDeque1.add(111);
        System.out.println("Array deque : " + arrayDeque1);

        // adding element to start of the deque
        arrayDeque1.addFirst(-99);
        System.out.println("Array deque : " + arrayDeque1);

        // remove element : first element as per logic 
        // FIFO: which was inserted first
        int firstElement = arrayDeque1.poll();
        System.out.println("first element removed: " + firstElement);
        System.out.println("Array deque after poll : " + arrayDeque1);

        // remove elment: last element of the deque 
        // which was inserted last
        int lastElement = arrayDeque1.pollLast();
        System.out.println("last element removed: " + lastElement);
        System.out.println("Array deque after pollLast : " + arrayDeque1);

        // clear all elements of deque
        arrayDeque1.clear();
        System.out.println("Array deque after clear : " + arrayDeque1);

    }
}