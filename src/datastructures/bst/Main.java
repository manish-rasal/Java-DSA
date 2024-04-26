package datastructures.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        myBST.deleteNode(2);
        System.out.println(myBST.root.left.value);
        System.out.println(myBST.root.right);
    }
}
