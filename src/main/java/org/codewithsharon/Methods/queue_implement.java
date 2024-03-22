package org.codewithsharon.Methods;

public class queue_implement {
    public static void main(String[] args) {
        queue_int q1 = new queue_int();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());


    }
    }
