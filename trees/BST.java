/*  Created Binary search tree class without constructor as
its not required because we are not initializing anything
by Default root node will be null and we are not 
initializing the root with some value.*/

public class BST {
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    public Node getRoot(){
        return root;
    }

    public boolean insert(int value){
        // Create a new node with the given value
        Node newNode = new Node(value);
        // If tree is empty, set root to new node
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            // If value already exists, do not insert
            if(newNode.value == temp.value){
                return false;
            }
            // Traverse left if value is less
            if(newNode.value < temp.value){
                // Insert if left child is null
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else{
                // Traverse right if value is greater
                if(temp.right == null){
                    temp.right =newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // Method to check if a value exists in the BST
    public boolean contains(int value){
        int count = 0; // Counter to track number of steps taken (optional)
        if(root == null) return false; // If tree is empty, value not found
        Node temp = root;
        while(temp != null){
            // Traverse left if value is less than current node's value
            if(value < temp.value){
                count++;
                temp = temp.left;
            }
            // Traverse right if value is greater than current node's value
            else if(value > temp.value){
                count++;
                temp = temp.right;
            }
            // Value found
            else{
                System.out.println(count); // Print number of steps taken
                return true;
            }
        }
        // Value not found after traversal
        return false;
    } 
}
