package linkedlist;

public class LL {
    // +===================================================+
    // | WRITE YOUR CODE HERE |
    // | Description: |
    // | - Constructor for the LinkedList class. |
    // | - Initializes the linked list with a single node. |
    // | |
    // | Parameters: |
    // | - value: The integer value of the first node in |
    // | the newly created linked list. |
    // | |
    // | Behavior: |
    // | - A new Node is created with the given value. |
    // | - This node is set as both the head and tail of |
    // | the list, indicating it is the only node in the |
    // | list at creation. |
    // | - The length of the list is initialized to 1. |
    // +===================================================+

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    LL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        //Edge case: when you hava 0 items in the linkedlist
        if (length == 0)   return null;
        Node prev = head;
        Node temp = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;

        }
        tail = prev;
        System.out.println("prev: " + prev.value);
        tail.next = null; // this is how we remove item from last
        length--;
        //Edge case: when you have only 1 item in the LL
        if(length ==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            // with temp node--> consumes extra space as we create a temp Node.
                // Node temp = head;
                // head = newNode;
                // head.next = temp;
            newNode.next = head;
            head = newNode;
        }
        length++; // length gets incremented once the value is prepended.
    }

    public Node get(int index){
        // return null if index is less than 0 or more than length
        if( index <0 || index>=length) return null;
        Node temp = head;

        // int count =0;
        // while(temp.next!=null){
        //     if(count==index){
        //         return temp;
        //     }
        //     temp= temp.next;
        //     count++;
            
        // }

        for (int i =0;i< index;i++){
            temp = temp.next;
        }
        return temp; 
    }
    
    public boolean set(int index, int value){
        // cant use the node directly as its a temp node, but value is gets pointed directly.
        Node temp = get(index);
        if(temp!=null){
        temp.value = value;
        return true;
    }
        return false;
    }

    public boolean insert(int index, int value){
        //To add within range
        if(index<0 || index > length) return false;
        //Case to add at 0 index
        if(index == 0){
            prepend(value);
            return true;
        }
        //Case to add at last
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1); // to get the previous node, which is used for attaching the new node to the previous node
        newNode.next = temp.next; // attach new node's pointer to point index node by temp which is already pointing.
        temp.next = newNode; // attach previous node's pointer to new node
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst(); 
        if(index == length-1) return removeLast();
        Node prev = get(index-1);
        // Node temp = get(index); not recommended as its O(n) to do with O(1)
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        //Swapping head and tail
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
    
    public Node removeFirst(){
        //Edge case if length is 0
        if(length == 0) return null;
        Node temp = head;
        //Edge case if length is 1, set the temp to head and update head and tail to null
        // if(length == 1){
        //     head = null;
        //     tail = null;
        // }
        
        head = head.next; // move the head to the second node
        temp.next = null; // to remove the connection from the linkedlist
        length--; // all the removal methods should have a length decrementation
        //Instead of edge case length =1, there head will already pointing to null, just update the tail pointer to null
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
