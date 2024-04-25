package org.codewithsharon.ds;

public class DoublyLinkedList {

    Node head;
    Node tail;
    class Node{
        int data;
         Node next,prev;
         Node (int val){
             data =val;
             next=null;
             prev=null;
         }
     }
    public  DoublyLinkedList(){
        head = null;
         tail = null;
    }
 public void insertatBeg(int val){
        Node newNode = new Node (val);

        if(head==null){
        head = newNode;
        tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head = newNode;
        }
 }
 public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;

        }
 }
 public  void displayrev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp =temp.prev;

        }
    }
}
