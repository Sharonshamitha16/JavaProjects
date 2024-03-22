package org.codewithsharon.Methods;

public class queue_int {
 static int size = 3;
int q []= new int[size];
int rear=0;int front =0;
 public void enqueue(int val){
     if(rear==size){
         System.out.println("queue is full");
     }
     else{
         q[rear]=val;
         rear++;
     }
 }
 public int dequeue()
 {
     if(front==rear){
         System.out.println("queue is empty");

     }
     else {
         q[front]=rear;
         front++;
         System.out.println("DEQUEUE ELEMENT IS:"+q[front]);
     }
     return q[front];
 }}
