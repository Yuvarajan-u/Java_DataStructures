package linkedlist;


public class Main {
    public static void main(String[] args) {

        LL myLinkedList = new LL(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.append(5);
        myLinkedList.append(29);
        myLinkedList.insert(1, 893);
        System.out.println("set value at index 2: "+ myLinkedList.set(2, 48));

        myLinkedList.printList();
        myLinkedList.prepend(289);
        System.out.println("Get value response: "+myLinkedList.get(3).value);
        // System.out.println("Removed FirstItem: "+myLinkedList.removeFirst().value);

        // System.out.println("Last Removed Item: "+myLinkedList.removeLast().value);
        // System.out.println("Last Removed Item: "+myLinkedList.removeLast().value);
        // System.out.println("Last Removed Item: "+myLinkedList.removeLast().value);
        // System.out.println("Last Removed Item: "+myLinkedList.removeLast()); // returns null

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.getLength();

        myLinkedList.reverse();
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            
            Linked List:
            4

        */

    }
}
