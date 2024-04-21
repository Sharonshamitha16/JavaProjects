package org.codewithsharon.ds;

public class BinarysearchTree {

    Node root; // reference variable


    class Node {
        int key;
        Node left, right;// reference variable

        public Node(int val) { // constructor assigning key as val and left,right as null
            key = val;
            left = right = null;
        }
    }

    public BinarysearchTree(int val) { //constructor for binarysearchtree assigning root as new node and inseertion takes place
        root = new Node(val);
    }

    public BinarysearchTree() {
        root = null;
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.key) {
            root.left = insert(root.left, val);
        }
        if (val > root.key) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void insert(int val) {
        insert(root, val);
    }

    public void Inorder(Node root) {
        if (root != null) {
            Inorder(root.left);
            System.out.print(root.key + " ");
            Inorder(root.right);
        }
    }

    public Node Search(Node root, int val) {
        if (root == null || root.key == val) {
            return root;
        }
        if (val < root.key)
            return Search(root.left, val);
        return Search(root.right, val);
    }

    public Node delete(Node root, int val) {
        if (root == null) {
            return root;
        }
        if (val < root.key) {
            root.left = delete(root.left, val);
        } else if (val > root.key) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
        root.key = mins(root.right);
        root.right = delete(root.right, root.key);
        }
        return root;
    }

    public int mins(Node root) {
        int minval = root.key;
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }


    public static void main(String[] args) {

        BinarysearchTree bst = new BinarysearchTree(50);
        bst.insert(bst.root, 20);
        bst.insert(70);
        bst.insert(10);
        bst.insert(15);
        bst.insert(60);
     bst.insert(55);
     bst.insert(90);
     bst.insert(80);
     bst.insert(75);
        bst.Inorder(bst.root);
        bst.delete(bst.root , 70);
        bst.Inorder(bst.root);
        if (bst.Search(bst.root, 70) == null) {
            System.out.println("not found");
        } else {
            System.out.println("found");

        }
        bst.delete(bst.root, 70);
        bst.Inorder(bst.root);
    }
}

