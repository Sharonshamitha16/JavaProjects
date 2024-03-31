package org.codewithsharon.ds;

public class LinkedList {
    node head;//creating a head using a object class

    class node {// craeting class for node
        int data; //assigning parameters for data and for ptr as java doesn't have a pointer we use here next for denoting it..
        node next;

        node(int val) {// creating a constructor for node to assign a value for data next denotes ptr which has the previous address of the data as it's  starting pt that is insertion it's null
            data = val;
            next = null;
        }
    }

    LinkedList() { // creating a constructor for linkedlist top denote that now head is null at the start of the insertion point
        head = null;

    }

    public void insertatbeigning(int val) {// writing method for insertion at the begining
        node newnode = new node(val);// creating a object for class node to use
        //when nodeis empty
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head; // firstly saving the previous data's address to this pointer as we won't be able to miss the data
            head = newnode;// creating this as head as we are trying to insert at front ie begining...

        }
    }

    public void display() {
        node temp = head;// storing head in temp bcoz every time heaad changes if any problem occurs then difficult to fix
        while (temp != null) { // running a while looptill the tail ie tail will be null

            System.out.print(temp.data + " ");//printing the data ie the values stired in temp
            temp = temp.next;//jumping to the next element
        }

    }

    public void insertatpos(int pos, int val) {

        node newnode = new node(val);
        node temp = head;/// assigning head as temp
        //while insertinf ta pos 0 then it should insert properly at the 0th position
        if(pos==0){
            insertatbeigning(val);
            return;//this stops the code here return the insertatbegin method completes won;t proceed to next step...
        }
        for (int i = 1; i < pos; i++) {
            temp = temp.next;//jumping to the postion mentioned

        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
}

