package org.codewithsharon.ds;

public class BinaryTree {
    Node root;

    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = null;
            right = null;
        }

    }

    public BinaryTree(int d) {
        root = new Node(d);
    }

    public void InsertLeft(Node r, int val) {
        Node newNode = new Node(val);
        r.left = newNode;
    }

    public void InsertRight(Node r, int val) {
        Node newNode = new Node(val);
        r.right = newNode;
    }

    public static void Preorder(Node root) {
        if (root != null) {
            System.out.print(root.data +" ");
            Preorder(root.left);
            Preorder(root.right);

        }}

        public static void Inorder (Node root){
            if (root != null) {
                Inorder(root.left);
                System.out.print(root.data +" ");
                Inorder(root.right);

            }
        }
        public static void Postorder (Node root){
            if (root != null) {
                Postorder(root.left);
                Postorder(root.right);
                System.out.print(root.data + " ");

            }
        }
    }



