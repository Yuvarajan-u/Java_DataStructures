package basics.pointers;

public class Pointer {
    public static void main(String[] args) {
        // Example 1: Integer pointing
        int a = 10;
        int b = a; // b points to the value of a
        System.out.println("Before updating a: a = " + a + ", b = " + b);
        a = 20; // Updating a does not affect b
        System.out.println("After updating a: a = " + a + ", b = " + b);

        // Example 2: Pointer-like behavior with HashMap
        java.util.HashMap<String, Integer> map1 = new java.util.HashMap<>();
        map1.put("key", 10);

        java.util.HashMap<String, Integer> map2 = map1; // map2 points to the same object as map1
        System.out.println("Before updating map1: map1 = " + map1 + ", map2 = " + map2);
        map1.put("key", 20); // Updating map1 affects map2 since they point to the same object
        System.out.println("After updating map1: map1 = " + map1 + ", map2 = " + map2);
    }
}
