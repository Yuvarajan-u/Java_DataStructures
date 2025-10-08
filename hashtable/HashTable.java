package hashtable;

import java.util.ArrayList;

// HashTable implementation using separate chaining for collision resolution
public class HashTable {

    // Default size of the underlying array
    private int size = 7;
    // Array to store linked lists (chains) of nodes
    private Node[] dataMap;

    // Node class represents each key-value pair in the hash table
    class Node {
        private String key;
        private int value;
        private Node next;

        // Node constructor
        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // HashTable constructor initializes the dataMap array
    public HashTable() {
        dataMap = new Node[size];
    }

    // Getter for the dataMap array
    public Node[] getDataMap() {
        return dataMap;
    }

    private int hash(String key) {
        int hash = 0;

        for (char c : key.toCharArray()) {
            hash = (hash + c * 23) % dataMap.length;
        }
        return hash;
    }

    public void printhash(String key) {
        System.out.println(key + " : " + hash(key));
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        Node temp = dataMap[index];
        if(dataMap[index]==null){
            dataMap[index]=newNode;
        }
        else{
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}

public int get(String key){
    int index = hash(key);
    Node temp = dataMap[index];
    while(temp!=null){
        if(temp.key.equals(key)) return temp.value;
        temp = temp.next;
    } 
    return 0;
}

/**
 * Retrieves all the keys stored in the hash table.
 *
 * <p>This method iterates through each bucket in the underlying data map.
 * For each bucket, it traverses the linked list of nodes and collects
 * the key from each node. The collected keys are added to an ArrayList,
 * which is returned at the end.</p>
 *
 * @return an ArrayList containing all the keys present in the hash table
 */
public ArrayList<String> keys(){
    ArrayList<String> allkeys = new ArrayList<>();
    for(int i =0; i< dataMap.length;i++){
        Node temp = dataMap[i];
        while(temp!=null){
            allkeys.add(temp.key);
            temp = temp.next;
        }
    }
    return allkeys;
}
    // Prints the contents of the hash table
    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if (dataMap[i] != null) {
                Node temp = dataMap[i];
                // Traverse the linked list at this index
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

}