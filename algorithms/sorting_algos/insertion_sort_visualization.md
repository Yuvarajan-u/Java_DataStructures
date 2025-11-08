# Insertion Sort on Linked List — Step-by-Step Visualization

## Initial State (before sorting)
```
head -> [5] -> [4] -> [3] -> [2] -> [1] -> null
length >= 2 so we run insertionSort()
```

After setup:
```java
Node sortedListHead = head;         // [5]
Node unsortedListHead = head.next; // [4]
sortedListHead.next = null;        // sorted = [5] -> null
```

So the lists are:
```
sortedListHead -> [5] -> null
unsortedListHead -> [4] -> [3] -> [2] -> [1] -> null
head still points to original head ([5])
```

---

## Iteration 1 — take node `4`
**Before**
```
sorted: [5] -> null
unsorted: [4] -> [3] -> [2] -> [1] -> null
```

**Pick and detach**
```java
Node currentNode = unsortedListHead;    // currentNode -> [4]
unsortedListHead = unsortedListHead.next; // unsortedListHead -> [3]
currentNode.next = null;                // detach: [4] -> null
```

**Compare & insert**
`4 < 5` → insert at head:
```
[4] -> [5] -> null
```

**After**
```
sorted: [4] -> [5] -> null
unsorted: [3] -> [2] -> [1] -> null
head -> [4]
```

---

## Iteration 2 — take node `3`
**Before**
```
sorted: [4] -> [5] -> null
unsorted: [3] -> [2] -> [1] -> null
```

**Pick and detach**
```
currentNode -> [3]
unsortedListHead -> [2]
currentNode.next = null
```

**Compare & insert**
`3 < 4` → insert at head:
```
[3] -> [4] -> [5] -> null
```

**After**
```
sorted: [3] -> [4] -> [5] -> null
unsorted: [2] -> [1] -> null
head -> [3]
```

---

## Iteration 3 — take node `2`
**Before**
```
sorted: [3] -> [4] -> [5] -> null
unsorted: [2] -> [1] -> null
```

**Pick and detach**
```
currentNode -> [2]
unsortedListHead -> [1]
currentNode.next = null
```

**Compare & insert**
`2 < 3` → insert at head:
```
[2] -> [3] -> [4] -> [5] -> null
```

**After**
```
sorted: [2] -> [3] -> [4] -> [5] -> null
unsorted: [1] -> null
head -> [2]
```

---

## Iteration 4 — take node `1`
**Before**
```
sorted: [2] -> [3] -> [4] -> [5] -> null
unsorted: [1] -> null
```

**Pick and detach**
```
currentNode -> [1]
unsortedListHead -> null
currentNode.next = null
```

**Compare & insert**
`1 < 2` → insert at head:
```
[1] -> [2] -> [3] -> [4] -> [5] -> null
```

**After**
```
sorted: [1] -> [2] -> [3] -> [4] -> [5] -> null
unsorted: null
head -> [1]
```

---

## Final Result
```
head -> [1] -> [2] -> [3] -> [4] -> [5] -> null
```

✅ **Sorted ascending!**

---

## Why `currentNode.next = null` is essential
Without detaching, each node you pick still points into the unsorted list,
so inserting it at the front could corrupt links or skip nodes.
Detaching ensures each node is clean before re-linking.

---

## Why `head = sortedListHead` every iteration is essential
When you insert at the head (`if` case), the list’s starting point changes.
Updating `head` each time keeps it pointing to the true start of the sorted list.

---

### ✅ Summary

| Step | Action | Sorted List | Unsorted List | Head |
|------|---------|--------------|---------------|------|
| Init | Setup | [5] | [4,3,2,1] | [5] |
| 1 | Insert 4 | [4,5] | [3,2,1] | [4] |
| 2 | Insert 3 | [3,4,5] | [2,1] | [3] |
| 3 | Insert 2 | [2,3,4,5] | [1] | [2] |
| 4 | Insert 1 | [1,2,3,4,5] | [] | [1] |

All nodes sorted in ascending order.
