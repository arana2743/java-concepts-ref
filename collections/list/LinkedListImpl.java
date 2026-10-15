import java.util.LinkedList;


// List interface implementation with LinkedList
// can contain duplicate elements and has not indexing
class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        System.out.println("Linked list size: " + linkedList1.size());
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(30);
        linkedList1.add(1);
        System.out.println("Linked list: " + linkedList1);
        System.out.println("Linked list size: " + linkedList1.size());

        // add element to start of the linkedlist
        linkedList1.addFirst(-99);
        System.out.println("Linked list: " + linkedList1);

        // check head : doesn't remove the first head element
        int headElement = linkedList1.peek();
        System.out.println("Head of linked list from peek(): " + headElement);
        System.out.println("Linked list: " + linkedList1);

        // check last element: doesn't remove the last element
        int lastElement1 = linkedList1.peekLast();
        System.out.println("Last element of linked list from peekLast(): " + lastElement1);
        System.out.println("Linked list: " + linkedList1);

        // check and retrieve first element from linkedList
        int firstElement = linkedList1.poll();
        System.out.println("Fetch first element from poll(): " + firstElement);
        System.out.println("Linked list: " + linkedList1);

        // check and retrive last element from linkedlist
        int lastElement2 = linkedList1.pollLast();
        System.out.println("Last element of linked list from pollLast(): " + lastElement2);
        System.out.println("Linked list: " + linkedList1);

        // clear method to clear entire linkedList
        linkedList1.clear();
        System.out.println("Linked list: " + linkedList1);
    }
}