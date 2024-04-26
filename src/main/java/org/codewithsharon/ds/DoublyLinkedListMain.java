package org.codewithsharon.ds;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublelist = new DoublyLinkedList();
        doublelist.insertatBeg(9);
        doublelist.insertatBeg(7);
        doublelist.insertatBeg(10 );
        System.out.println("display at beg");
        doublelist.display();
        System.out.println();
        System.out.println("display at beg as rev" );
        doublelist.displayrev();
        System.out.println();
        System.out.println("inserting at pos 2");
        doublelist.insertatpos(3,8 );
//        System.out.println();
        System.out.println("display at pos");
        doublelist.display();
        System.out.println();
        System.out.println("display at pos as rev" );
        doublelist.displayrev();
    }
}
