package org.codewithsharon.ds;

public class linkedlistmain {
    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        lk.insertatbeigning(9);
        lk.insertatbeigning(8);
        lk.display();
        System.out.println();
        lk.insertatpos(1,7);
        lk.display();
        System.out.println();
        lk.insertatpos(0,10);
        lk.display();

        // System.out.println(lk.insertatbeigning(8));
    }
}
