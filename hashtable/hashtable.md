# Hash Table in Java

A **Hash Table** is a data structure that stores key-value pairs and provides fast insertion, deletion, and lookup operations. It uses a **hash function** to compute an index (hash code) into an array of buckets, from which the desired value can be found.

---

## How Hashing Works

- **Hash Function:** Converts a key (e.g., a string) into an integer index.
- **Buckets:** The hash table uses an array where each index is a bucket.
- **Collision Handling:** When two keys hash to the same index, a collision occurs. Common strategies:
  - **Separate Chaining:** Each bucket holds a linked list of entries.
  - **Open Addressing:** Find another open slot in the array.

---

## Main Features

- **Fast Operations:** Average-case O(1) time for insert, delete, and lookup.
- **Key-Value Storage:** Efficient mapping from keys to values.
- **Dynamic Resizing:** Many implementations resize the array when it gets too full.
- **Collision Resolution:** Handles cases where multiple keys map to the same index.


## Things to note:

- **Since a Hash Table is O(1) for Insert and Lookup it is always better than a Binary Search Tree**: False
while hash tables provide O(1) operations for insertion and lookup, binary search trees are better for range searches due to their sorted nature. This allows you to efficiently find all values within a specified range, a capability that hash tables do not offer.

- **Looking up a value in a Hash Table is O(1):** False
while key lookups in hash tables are generally O(1) on average, the question specifically states looking up a value, which can be less efficient as it may require scanning the entire table in the worst case. This distinction is crucial for understanding the performance limitations of hash tables compared to more structured data storage methods.




---

## Common Methods

| Method         | Description                                 |
|----------------|---------------------------------------------|
| `put(key, value)`    | Insert or update a key-value pair         |
| `get(key)`           | Retrieve the value for a given key        |
| `remove(key)`        | Delete the key-value pair                 |
| `containsKey(key)`   | Check if a key exists                     |
| `size()`             | Get the number of key-value pairs         |
| `printTable()`       | Print the contents of the hash table      |

---

## Importing HashMap in Java

Java provides a built-in hash table implementation called `HashMap` in the `java.util` package.

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.put("banana", 5);
System.out.println(map.get("apple")); // Output: 3
```

---

## Example: Custom Hash Table Class

```java
// Simple custom hash table with separate chaining
class HashTable {
    private class Node {
        String key;
        int value;
        Node next;
        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node[] dataMap = new Node[7];

    // Hash function
    private int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash = (hash + c* 23) % dataMap.length;
        }
        return hash;
    }

    // Insert key-value pair
    public void put(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    // Get value by key
    public Integer get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }
        return null;
    }
}
```

---

## Summary

- Hash tables provide fast access to data using keys.
- Hashing and collision resolution are key concepts.
- Java's `HashMap` is a widely used