# Heap Data Structure

A **heap** is a complete binary tree that satisfies the heap property:  
- In a **max heap**, every parent node is greater than or equal to its children.  
- In a **min heap**, every parent node is less than or equal to its children.

## Heap vs Binary Search Tree (BST)

- **Similarities**: Both are binary trees and can be implemented using nodes or arrays.
- **Differences**:  
    - BSTs maintain strict order (left < root < right), allowing fast search.  
    - Heaps only maintain the heap property (parent ≥/≤ children), not strict ordering, and are always complete binary trees.

## Types of Heaps

- **Max Heap**: Parent nodes are greater than or equal to children. Used for priority queues, heap sort.
- **Min Heap**: Parent nodes are less than or equal to children. Used in algorithms like Dijkstra's shortest path.

## Array Representation

Heaps are efficiently implemented using arrays.  
For an element at index `i`:
- **Left Child**: `2 * i + 1`
- **Right Child**: `2 * i + 2`
- **Parent**: `(i - 1) / 2`

## Why Keep Index 0 Open?

Some implementations leave index 0 unused (1-based indexing) to simplify calculations:
- **1-based**: Left = `2 * i`, Right = `2 * i + 1`, Parent = `i / 2`
- **0-based**: Left = `2 * i + 1`, Right = `2 * i + 2`, Parent = `(i - 1) / 2`
- **Java uses 0-based indexing** for efficiency and convention.

## Heap Operations

### Insert

Add the new element at the end, then "bubble up" to restore the heap property.

### Remove (Extract Max/Min)

Replace root with last element, remove last, then "sink down" to restore heap property.

### Sink Down ( )

Used after removal or replacement to restore heap property by moving the root down.

### Helper Functions

- **peek()**: Returns root (max/min) without removing.
- **size()**: Returns number of elements.
- **isEmpty()**: Checks if heap is empty.

## Specialities

- **Complete Binary Tree**: All levels filled except possibly the last.
- **Efficient Operations**: Insert and remove in O(log n) time.
- **Applications**: Priority queues, heap sort, graph algorithms.

## 0-based vs 1-based Indexing

- **0-based**: Saves space, standard in Java.
- **1-based**: Simplifies calculations, sometimes used in textbooks.

---

## Java Implementation

### Max Heap (0-based Indexing)

```java
import java.util.*;

public class MaxHeap {
        private List<Integer> heap = new ArrayList<>();

        // Insert value into heap
        public void insert(int value) {
                heap.add(value);
                int i = heap.size() - 1;
                while (i > 0 && heap.get(parent(i)) < heap.get(i)) {
                        swap(i, parent(i));
                        i = parent(i);
                }
        }

        // Remove and return max value (root)
        public int removeMax() {
                if (heap.isEmpty()) throw new NoSuchElementException();
                int max = heap.get(0);
                int last = heap.remove(heap.size() - 1);
                if (!heap.isEmpty()) {
                        heap.set(0, last);
                        sinkDown(0);
                }
                return max;
        }

        // Sink down to restore heap property
        private void sinkDown(int i) {
                int size = heap.size();
                while (true) {
                        int left = leftChild(i), right = rightChild(i), largest = i;
                        if (left < size && heap.get(left) > heap.get(largest)) largest = left;
                        if (right < size && heap.get(right) > heap.get(largest)) largest = right;
                        if (largest == i) break;
                        swap(i, largest);
                        i = largest;
                }
        }

        // Helper functions
        public int peek() { return heap.get(0); }
        public int size() { return heap.size(); }
        public boolean isEmpty() { return heap.isEmpty(); }

        // Index calculations
        private int parent(int i) { return (i - 1) / 2; }
        private int leftChild(int i) { return 2 * i + 1; }
        private int rightChild(int i) { return 2 * i + 2; }
        private void swap(int i, int j) {
                int temp = heap.get(i);
                heap.set(i, heap.get(j));
                heap.set(j, temp);
        }
}
```

### Max Heap (1-based Indexing Example)

```java
// For illustration, not typical in Java
private int parent(int i) { return i / 2; }
private int leftChild(int i) { return 2 * i; }
private int rightChild(int i) { return 2 * i + 1; }
```

---

**Note:**  
- For min heap, reverse the comparison operators.
- Heaps are not designed for fast search, but for fast insert/remove max/min.
- Used in priority queues, heap sort, and graph algorithms.


