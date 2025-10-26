package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DLL myDLL = new DLL(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.append(38);

        myDLL.append(578);
        myDLL.insert(2,289);

        myDLL.append(8392);
        // System.out.println("using non eff method Removing node from index 2: '289': "+myDLL.remove_1(2).value);
        System.out.println("Removing node from index 2: '289': "+myDLL.remove(2).value);
        
        
        // calling get
        System.out.println("Getting Node value from 2nd index: "+ myDLL.get(2).value);

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();
        myDLL.getLength();

        //calling set changes value from 578 to 931
        myDLL.set(3,931);

        System.out.println("removed last item: "+ myDLL.removeLast().value);
        System.out.println("removed last item: "+ myDLL.removeLast().value);
        System.out.println("removed last item: "+ myDLL.removeLast().value);
        System.out.println("removed last item: "+ myDLL.removeLast().value);
        System.out.println("removed last item: "+ myDLL.removeLast());
        myDLL.getLength();
        myDLL.prepend(381);
        myDLL.prepend(245);
        myDLL.printList();
        myDLL.getLength();

        System.out.println("removed First item: "+ myDLL.removeFirst().value);
        System.out.println("removed First item: "+ myDLL.removeFirst().value);
        System.out.println("removed First item: "+ myDLL.removeFirst());
        myDLL.printList();
        myDLL.getLength();



        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 7
            Tail: 7
            Length: 1

            Doubly Linked List:
            7

        */
    }
}
