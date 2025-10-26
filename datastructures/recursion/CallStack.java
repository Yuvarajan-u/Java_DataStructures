package recursion;

public class CallStack {

public static void main(String[] args) {
        functionA();
    } 

    static void functionA() {
        System.out.println("Entered functionA");
        functionB();
        System.out.println("Exiting functionA");
    }

    static void functionB() {
        System.out.println("Entered functionB");
        functionC();
        System.out.println("Exiting functionB");
    }

    static void functionC() {
        System.out.println("Entered functionC");
        System.out.println("Exiting functionC");
    }
    
}
