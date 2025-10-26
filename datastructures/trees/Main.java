package trees;

public class Main {
    public static void main(String[] args) {
        BST mybst = new BST();
        System.out.println("Root is : "+mybst.getRoot());

        System.out.println(mybst.contains(78));
        mybst.insert(47);
        mybst.insert(21);
        mybst.insert(76);
        mybst.insert(18);
        mybst.insert(52);
        mybst.insert(82);
        // inserting a node from root's left's right
        mybst.insert(27);
        System.out.println(mybst.root.left.right.value);


        System.out.println(mybst.contains(78));
        System.out.println(mybst.contains(27));

        System.out.println(mybst.BFS());
        System.out.println(mybst.DFS());
    }
}
/*
        47
       /  \
     21    76
    /  \   / \
  18   27 52 82

 */
