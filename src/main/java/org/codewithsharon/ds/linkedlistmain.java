package org.codewithsharon.ds;

public class linkedlistmain {
    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        lk.insertatBeg(9);
        lk.insertatBeg(8);
        lk.insertatBeg(6);
        System.out.println("displaying at the begining: ");
        lk.display();
        lk.insertatPos(2, 7);
        System.out.println("displaying at 2 postion insertion");
        lk.display();
        System.out.println("displaying at position 0 insertion");
        lk.insertatPos(0, 10);
        lk.display();


        lk.getnode(0);
        LinkedList.Node node = lk.getnode(2); // Get node at position 1
        if (node != null) {
            System.out.println("Data at position 1: " +node.data);
            System.out.println();
        } else {
            System.out.println("Node not found at position or position invalid ");
            System.out.println();
        }
        System.out.println("updating value for given position:");
        lk.updatenode(1,2);
        lk.display();

        System.out.println("deleting at position 3  last");
        lk.deleteatpos(3);
        lk.display();
        System.out.println("deleting at end:");
        lk.deleteatend(9);
        lk.display();

    }
}
