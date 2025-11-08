package algorithms.sorting_algos;

public class LinkedList_sorting {
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

    public LinkedList_sorting(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
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

    public void bubbleSort() {
        if (length >= 2) {
            Node sortedUntil = null;

            while (head != sortedUntil) {
                Node currentNode = head;
                while (currentNode != sortedUntil) {
                    if (currentNode.value > currentNode.next.value) {
                        int temp = currentNode.value;
                        currentNode.value = currentNode.next.value;
                        currentNode.next.value = temp;
                    }
                    currentNode = currentNode.next;
                }
                sortedUntil = currentNode;
            }
        }

    }

    public void selectionSort() {
        if (length >= 2) {
            Node currentNode = head;
            while (currentNode.next != null) {
                Node smallest = currentNode;
                Node innerCurrent = currentNode.next;
                while (innerCurrent != null) {

                    if (innerCurrent.value < smallest.value) {
                        smallest = innerCurrent;

                    }
                    innerCurrent = innerCurrent.next;
                }

                if (smallest != currentNode) {
                    int temp = smallest.value;
                    smallest.value = currentNode.value;
                    currentNode.value = temp;

                }
                currentNode = currentNode.next;
            }
        }
    }

    public void insertionSort() {
        if (length >= 2) {
            Node sortedListHead = head;
            Node unsortedListHead = head.next;
            sortedListHead.next = null;
            while (unsortedListHead != null) {
                Node currentNode = unsortedListHead;
                unsortedListHead = unsortedListHead.next;
                currentNode.next = null;
                if (currentNode.value < sortedListHead.value) {
                    currentNode.next = sortedListHead;
                    sortedListHead = currentNode;
                } else {
                    Node searchPointer = sortedListHead;
                    while (searchPointer.next != null && currentNode.value > searchPointer.next.value) {
                        searchPointer = searchPointer.next;
                    }
                    currentNode.next = searchPointer.next;
                    searchPointer.next = currentNode;
                    head = sortedListHead;
                }
            }
        }
    }

}
