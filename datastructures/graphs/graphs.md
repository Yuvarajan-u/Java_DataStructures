# Graphs Data Structure

A **graph** is a data structure consisting of a set of **vertices** (nodes) and a set of **edges** (connections) that link pairs of vertices. Graphs are used to model relationships and connections in networks, such as social networks, transportation systems, and web links.

---

## Terminology

- **Vertex (Node):** Fundamental unit or point in a graph.
- **Edge:** Connection between two vertices.
- **Weight:** A value assigned to an edge, representing cost, distance, etc.
- **Directed Graph:** Edges have a direction (from one vertex to another).
- **Undirected Graph:** Edges do not have direction; connection is mutual.
- **Bidirected Graph:** Each edge is treated as two directed edges in opposite directions.

---

## Graph Representations

### 1. Adjacency List

- Each vertex stores a list of adjacent vertices.
- Space efficient for sparse graphs.
- Example:
  ```
  A: B, C
  B: A, D
  C: A
  D: B
  ```

### 2. Adjacency Matrix

- 2D array where rows and columns represent vertices.
- Entry at (i, j) is 1 (or weight) if there is an edge from i to j, else 0.
- Space efficient for dense graphs.
- Example:
  ```
    A B C D
  A 0 1 1 0
  B 1 0 0 1
  C 1 0 0 0
  D 0 1 0 0
  ```

---

## Common Operations and Big O Complexity

| Operation         | Adjacency List | Adjacency Matrix |
|-------------------|:--------------:|:----------------:|
| Add Vertex        | O(1)           | O(V²)            |
| Add Edge          | O(1)           | O(1)             |
| Remove Edge       | O(E)           | O(1)             |
| Remove Vertex     | O(V + E)       | O(V²)            |
| Check Edge Exists | O(V)           | O(1)             |
| Get Neighbors     | O(1)           | O(V)             |

- **V:** Number of vertices
- **E:** Number of edges

---

## Operations Explained

- **Add Vertex:** Insert a new node into the graph.
- **Add Edge:** Create a connection between two vertices.
- **Remove Edge:** Delete the connection between two vertices.
- **Remove Vertex:** Delete a node and all its associated edges. while finding the vertex can be done in O(1) time, you must also remove all edges connected to that vertex, which takes additional time, making the overall operation not O(1). 
- **Check Edge Exists:** Determine if an edge is present between two vertices.
- **Get Neighbors:** Retrieve all vertices connected to a given vertex.

---

## Weighted, Directed, and Undirected Graphs

- **Weighted Graph:** Each edge has an associated value (weight).
- **Directed Graph:** Edges have a direction (A → B).
- **Undirected Graph:** Edges have no direction (A — B).
- **Bidirected Graph:** Each undirected edge is represented as two directed edges.

---

## Things to note:
- **Graphs are the go to data structure when you need to represent entities and the relationships between them:**
'True' because graphs are indeed the preferred data structure for representing entities (nodes) and their relationships (edges), making them essential for modeling complex interactions in various domains such as social networks or transportation systems. This connection illustrates the fundamental role graphs play in understanding how different elements relate to one another.

## Summary

Graphs are versatile data structures for modeling relationships. Choice of representation (adjacency list vs. matrix) affects space and time complexity for operations. Understanding graph types and operations is essential for algorithms in networking, pathfinding, and more.