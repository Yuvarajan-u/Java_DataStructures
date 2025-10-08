# Tree Data Structure

A **tree** is a hierarchical data structure consisting of nodes, with a single node as the root. Each node can have zero or more child nodes, and there are no cycles. Trees are used to represent hierarchical relationships, such as file systems, organization charts, and more.

## Tree Terminology

- **Node:** Basic unit containing data.
- **Root:** The topmost node in a tree.
- **Parent:** A node that has one or more child nodes.
- **Child:** A node that descends from another node.
- **Leaf:** A node with no children.
- **Edge:** Connection between two nodes.
- **Subtree:** A tree formed by a node and its descendants.
- **Height:** The length of the longest path from the root to a leaf.
- **Depth:** The length of the path from the root to a node.

---

# Binary Search Tree (BST)

A **Binary Search Tree** is a special type of binary tree where:
- Each node has at most two children (left and right).
- For any node:
  - All values in the left subtree are **less than** the node’s value.
  - All values in the right subtree are **greater than** the node’s value.

## Difference Between Tree and BST

| Feature         | Tree                        | Binary Search Tree (BST)         |
|-----------------|----------------------------|----------------------------------|
| Structure       | Hierarchical               | Hierarchical, binary (max 2 children) |
| Ordering        | No specific order           | Left < Parent < Right            |
| Search Speed    | O(n) (general)              | O(log n) (if balanced)           |

---

## Big O of Basic BST Operations

| Operation | Average Case | Worst Case (skewed) |
|-----------|--------------|---------------------|
| Insert    | O(log n)     | O(n)                |
| Delete    | O(log n)     | O(n)                |
| Lookup    | O(log n)     | O(n)                |

- **n** = number of nodes in the tree.
- Operations depend on the height of the tree. If the tree is balanced, operations are fast (logarithmic). If not, they