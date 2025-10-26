# Stack Data Structure: Brief

A **stack** is a linear data structure that follows the **Last-In-First-Out (LIFO)** principle. This means the last element added (pushed) to the stack is the first one to be removed (popped). Common stack operations are:
- **push(x):** Add element `x` to the top.
- **pop():** Remove and return the top element.
- **peek():** Return the top element without removing it.
- **isEmpty():** Check if the stack is empty.

---

## Stack Implementation Using ArrayList

- **How:** Use Java's `ArrayList` to store stack elements. Push is done by `add()` at the end, pop by `remove(size-1)`.
- **Pros:** Fast random access, dynamic resizing.
- **Cons:** May require resizing (copying) when capacity is exceeded.

**Big O:**
- **push:** O(1) *amortized* (O(n) if resizing occurs)
- **pop:** O(1)

---

## Stack Implementation Using LinkedList

- **How:** Use Java's `LinkedList` or a custom singly/doubly linked list. Push and pop are done at the head (or tail).
- **Pros:** No resizing needed, memory efficient for frequent insertions/removals.
- **Cons:** Slightly more memory per element (node pointers).

**Big O:**
- **push:** O(1)
- **pop:** O(1)

---

## Summary

Both implementations offer O(1) push and pop. ArrayList is generally faster for access, but LinkedList is better if you expect lots of insertions/removals and don't need random access.