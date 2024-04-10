package org.codewithsharon.ds;

public class BinaryMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.InsertLeft(tree.root, 5);
        tree.InsertRight(tree.root,15);
        tree.InsertLeft(tree.root.left,3);
        tree.InsertRight(tree.root.left,8);
        tree.InsertLeft(tree.root.right,12);


        BinaryTree.Preorder(tree.root);
        System.out.println();
        BinaryTree.Inorder(tree.root);
        System.out.println();
        BinaryTree.Postorder(tree.root);
        System.out.println();

    }
}
