package queue;

public class Main {
    public static void main(String[] args) {
        Queue myq = new Queue(54);
        myq.printAll();
        myq.enqueue(278);
        myq.printAll();
        System.out.println("removing items: \n");
        System.out.println(myq.dequeue().value);
        System.out.println(myq.dequeue().value);
        System.out.println(myq.dequeue());
    }
}
