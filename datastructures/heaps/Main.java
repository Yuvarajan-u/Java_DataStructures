package heaps;

public class Main {

    public static void main(String[] args) {

        Heaps hp = new Heaps();
        hp.insert(99);
        hp.insert(25);
        hp.insert(72);
        hp.insert(61);
        hp.insert(58);
        hp.insert(39);
        hp.insert(24);

        System.out.println(hp.getHeap());


        hp.insert(100);

        System.out.println(hp.getHeap());


        hp.insert(75);

        System.out.println(hp.getHeap());

        hp.remove();

        System.out.println(hp.getHeap());

        /*
            EXPECTED OUTPUT:
            ----------------
            [99, 72, 61, 58]
            [100, 99, 61, 58, 72]
            [100, 99, 75, 58, 72, 61]

        */

    }

}
