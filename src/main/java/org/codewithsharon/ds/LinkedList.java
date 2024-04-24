package org.codewithsharon.ds;

import java.util.Iterator;

//public class LinkedList {
//    node head;//creating a head using a object class
//
//    class node {// craeting class for node
//        int data; //assigning parameters for data and for ptr as java doesn't have a pointer we use here next for denoting it..
//        node next;
//
//        node(int val) {// creating a constructor for node to assign a value for data next denotes ptr which has the previous address of the data as it's  starting pt that is insertion it's null
//            data = val;
//            next = null;
//        }
//    }
//
//    LinkedList() { // creating a constructor for linkedlist top denote that now head is null at the start of the insertion point
//        head = null;
//
//    }
//
//    public void insertatbeigning(int val) {// writing method for insertion at the begining
//        node newnode = new node(val);// creating a object for class node to use
//        //when nodeis empty
//        if (head == null) {
//            head = newnode;
//        } else {
//            newnode.next = head; // firstly saving the previous data's address to this pointer as we won't be able to miss the data
//            head = newnode;// creating this as head as we are trying to insert at front ie begining...
//
//        }
//    }
//
//    public void display() {
//        node temp = head;// storing head in temp bcoz every time heaad changes if any problem occurs then difficult to fix
//        while (temp != null) { // running a while looptill the tail ie tail will be null
//
//            System.out.print(temp.data + " ");//printing the data ie the values stired in temp
//            temp = temp.next;//jumping to the next element
//        }
//
//    }
//
//    public void insertatpos(int pos, int val) {
//
//        node newnode = new node(val);
//        node temp = head;/// assigning head as temp
//        //while insertinf ta pos 0 then it should insert properly at the 0th position
//        if(pos==0){
//            insertatbeigning(val);
//            return;//this stops the code here return the insertatbegin method completes won;t proceed to next step...
//        }
//        for (int i = 1; i < pos; i++) {
//            temp = temp.next;//jumping to the postion mentioned
//
//        }
//        newnode.next = temp.next;
//        temp.next = newnode;
//    }
//}
//
public class LinkedList <T> implements  Iterable<T>{
    Node head;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;
            @Override
            public boolean hasNext() {
                return temp!=null;
            }

            @Override
            public T next() {
                T val = temp.data;
                temp=temp.next;
                return val;
            }
        };
    }

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }

    }

    LinkedList() {
        head = null;
    }

    public void insertatBeg(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertatPos(int pos, T val) {
        if (pos == 0) {
            insertatBeg(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Add a new line after printing all nodes
    }

    public void deleteatpos(int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public Node   getnode(int pos) {

        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == pos) {
                return temp;
            }

            temp = temp.next;
            count++;
        }
        return null;
    }

    public void updatenode(int pos, T newvals) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (pos == count) {
                temp.data = newvals;
                count = (int) newvals;
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    public void deleteatend() {
        if (head == null || head.next == null) {
            head = null; // List is empty or has only one node
            return;
        }
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }

        temp.next = null;
   }
//        Node secondLast = head; // Start at the head of the list (1)
//        while (secondLast.next.next  != null) { // Iterate until the second-to-last node
//            secondLast = secondLast.next; // Move to the next node (2 -> 3 -> 4 ...)
//        }
//        secondLast.next = null; // Update the next pointer of second-to-last node to null
//    }

    public void searchelement(T vals){
        Node temp =head;
        int count =0;
        while (temp!=null){
            if(temp.data==vals){
                System.out.println(count);
            }
            count++;
            temp =temp.next;
        }
    }
    public boolean containselement(T vals){
        Node temp =head;
        int count =0;
        boolean yes = true;
        boolean no = false;
        while(temp!=null){
            if(temp.data==vals){
          //return temp.data==vals?yes:no
                System.out.println( "yes val present in "+ count +" position");
            }
//            else {
//                System.out.println( "no not present in the list.");
//            }
            count++;
            temp=temp.next;
        }
        return yes;
    }
    public void reverselist(){
        Node current = head;
        Node prev = null;
        Node next;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev = current;
            current=next;

        }
        head=prev;
    }
}

