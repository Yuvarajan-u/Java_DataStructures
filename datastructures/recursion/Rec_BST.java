package recursion;

public class Rec_BST {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null)
            return false;
        if (currentNode.value == value)
            return true;
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    // public boolean insert(int value) {
    //     // Create a new node with the given value
    //     Node newNode = new Node(value);
    //     // If tree is empty, set root to new node
    //     if (root == null) {
    //         root = newNode;
    //         return true;
    //     }
    //     Node temp = root;
    //     while (true) {
    //         // If value already exists, do not insert
    //         if (newNode.value == temp.value) {
    //             return false;
    //         }
    //         // Traverse left if value is less
    //         if (newNode.value < temp.value) {
    //             // Insert if left child is null
    //             if (temp.left == null) {
    //                 temp.left = newNode;
    //                 return true;
    //             }
    //             temp = temp.left;
    //         } else {
    //             // Traverse right if value is greater
    //             if (temp.right == null) {
    //                 temp.right = newNode;
    //                 return true;
    //             }
    //             temp = temp.right;
    //         }
    //     }
    // }

    private Node rInsert(Node currentNode, int value){
        if (currentNode == null){
            return new Node(value);
        }
        if( value<currentNode.value ){
            currentNode.left = rInsert(currentNode.left, value);
        }
        else if (value>currentNode.value ){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
        
    }

    public void rInsert(int value){
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    public void rDelete(int value){
        rDelete(root, value);
    }

    public Node rDelete(Node currentNode, int value){
        if (currentNode == null) return null;

        if (value < currentNode.value){
            currentNode.left = rDelete(currentNode.left, value);
        }
        else if (value > currentNode.value){
            currentNode.right = rDelete(currentNode.right, value);
        }
        else{
            if(currentNode.right == null & currentNode.left == null){
                currentNode = null;
            }
            else if(currentNode.right == null){
                currentNode = currentNode.left;
            }
            else if (currentNode.left == null){
                currentNode = currentNode.right;
            }
            else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = rDelete(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public int minValue(Node curNode){
        while(curNode.left != null){
            curNode = curNode.left;
        }
        return curNode.value;
    }

    public void printInOrder() {
    printInOrder(root);
    System.out.println();
}

private void printInOrder(Node node) {
    if (node == null) return;
    printInOrder(node.left);
    System.out.print(node.value + " ");
    printInOrder(node.right);
}

// Add this method to Rec_BST for a sideways tree view
public void printTree() {
    printTree(root, 0);
}

private void printTree(Node node, int level) {
    if (node == null) return;
    printTree(node.right, level + 1);
    System.out.println("    ".repeat(level) + node.value);
    printTree(node.left, level + 1);
}
    public static void main(String[] args) {
        Rec_BST bst = new Rec_BST();
        bst.rInsert(50);   // root
        bst.rInsert(30);   // left child of root
        bst.rInsert(70);   // right child of root
        bst.rInsert(20);   // left child of 30
        bst.rInsert(40);   // right child of 30
        bst.rInsert(60);   // left child of 70
        bst.rInsert(80);  
        bst.rInsert(10);  // left child of 20
        bst.rInsert(25);  // right child of 20
        bst.rInsert(35);  // left child of 40
        bst.rInsert(45);  // right child of 40
        bst.rInsert(55);  // left child of 60
        bst.rInsert(65);  // right child of 60
        bst.rInsert(75);  // left child of 80
        bst.rInsert(85);  // right child of 80
        bst.printTree();
        bst.rDelete(70);

        bst.printInOrder();
        bst.printTree();

        System.out.println("Finding if number 80 is available: "+ bst.rContains(80));
        System.out.println("Finding if number 61 is available: "+ bst.rContains(61));
    }
}
