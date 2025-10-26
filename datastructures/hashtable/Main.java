package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.printhash("hello");
        myHashTable.printhash("world");
        myHashTable.printhash("java");
        myHashTable.printhash("hash");
        myHashTable.printhash("table");

        myHashTable.set("nails", 38);
        myHashTable.set("screws", 42);
        myHashTable.set("hammer", 15);
        myHashTable.set("drill", 7);
        myHashTable.set("pliers", 23);
        myHashTable.set("saw", 12);


        myHashTable.printTable();

        System.out.println(myHashTable.get("drill"));
        System.out.println(myHashTable.get("cutter"));


        System.out.println(myHashTable.keys());
    }
}
