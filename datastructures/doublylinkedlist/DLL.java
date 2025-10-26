package doublylinkedlist;

public class DLL {
    private int length;
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    DLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
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

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            // connecting to previous node
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        // Creating a temp node to point to tail/ node to be removed
        Node temp = tail;

        // another method to make code readable
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;

        /*
         * this is not working for removing when list as only one element.
         * // updating the tail to previous node to the last node
         * tail = tail.prev;
         * // removing pointer from new tail to temp node
         * tail.next = null;
         * // removing pointer from temp node to tail node
         * temp.prev = null;
         * length--;
         * if (length == 0) {
         * head = null;
         * tail = null;
         * }
         * return temp;
         */
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // connecting newNode to head
            head.prev = newNode; // reverse connection from head
            head = newNode; // updating head
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0)
            return null; // Edge case where no items
        // Edge case where list has only one item
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;

        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        // Same method of linkedlist can be used, but to enhance it, node can be got
        // from the head if its in first half
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        // else node can be got from the last
        else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);

        Node before = get(index - 1); // gets the prev node of targetted index
        Node after = before.next; // points the targetted index

        newNode.prev = before; // attaches new to the node before one
        newNode.next = after; // attaches the new to the node after that which is in the targetted index
        before.next = newNode; // connects before to new
        after.prev = newNode; // connects new to after
        length++;

        return true;
    }

    public Node remove_1(int index) {
        // Usual way to remove a Node from an index.

        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();
        Node before = get(index - 1);
        Node temp = before.next;
        Node after = temp.next;

        before.next = after;
        after.prev = before;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public Node remove(int index) {
        // Efficient way to remove with one variable

        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();
        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.prev = null;
        temp.next = null;
        length--;

        return temp;
    }
}
