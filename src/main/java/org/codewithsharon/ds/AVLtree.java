package org.codewithsharon.ds;

public class AVLtree {
    Node root;
    class Node {
        int key;
        Node left,right;
        int height;
        // node constructor
        public Node(int val){
        key= val;
        left=right=null;
        height=0;
        }
    }
    // avl tree
    public  AVLtree(int val){
        root= new Node(val);
    }
    public int max(int a , int b){
        return a>b?a:b;
    }
    public int getHeight( Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
      public int getBalFact(Node node){
        return getHeight(node.left)-getHeight(node.right);
      }
      public Node leftRotate(Node z){
        Node y =z.right;
        Node t2= y.left;
        y.left=z;
        z.right= t2;
        z.height = 1+max(getHeight(z.left),getHeight(z.right));
        y.height= 1+max(getHeight(y.left),getHeight(y.right));
     return y;
    }
    public Node rightRotate(Node z){
        Node y =z.right;
        Node t2= y.left;
        y.left=z;
        z.right= t2;
        z.height = 1+max(getHeight(z.left),getHeight(z.right));
        y.height= 1+max(getHeight(y.left),getHeight(y.right));
        return y;
    }
    public void insert (int val){
        root = insert(root,val);
    }
    public Node insert (Node node , int val){
        if(node ==null){
            return new Node(val  );
        }
        if(val<node.key){
           node.left= insert(node.left,val);
        }
        else if(val>node.key){
           node.right= insert(node.right,val);
        }
        else
            return node;
        node.height= 1+ max(getHeight(node.left),getHeight(node.right));
        if(val==40){
            System.out.println(" the height of the " +node.key + " is updated as " + node.height);
        }
        int Balfactor = getBalFact(node);
        //ll case
         // the first l denotes the node position whether it's left or right and the second l denotes whether it's greater or less than it's a short trick to know
        //for eg l- node.left , l- <
        if(Balfactor>1&&val<node.left.key){
            return rightRotate(node);
        }
        //rr case
        // for eg r -node.right r - >
        if(Balfactor<-1&&val>node.right.key){
            return leftRotate(node);
        }
        //lr case
        // for eg l -node.left , r - >
        if(Balfactor>1&&val>node.left.key){
            node.left= leftRotate(node.left);
            return rightRotate(node);
        }
        //rl case
        // for eg r -node.right , l -  <
         if(Balfactor<-1 && val > node.right.key){
             node.right=rightRotate(node.right);
         }


        return node;

    }

public void Inorder(Node root) {
    if (root != null) {
        Inorder(root.left);
        System.out.println(root.key + " the height is "+ root.height);
        Inorder(root.right);
    }
}

public static void main(String[] args) {
    AVLtree avl = new AVLtree(50);
    avl.insert(20);
    avl.insert(60);
    avl.insert(10);
    avl.insert(30);
    avl.insert(40);
    //avl.insert();
    //avl.insert();
    avl.Inorder(avl.root);


}}