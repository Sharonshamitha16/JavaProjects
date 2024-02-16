package org.codewithsharon.Methods;

public class stack_char {
    char c[]= new char[10];
     int tos ;
     stack_char(){
         tos =-1;

     }
     void push (char items){
         if(tos==9){
             System.out.println("stack is full");
         }
         else{
             c[++tos]=  items;

         }
     }
     char pop(){
         if (tos>=0){
             return  c[tos--];
         }
         else {
             System.out.println("stack is empty");
             return (char) -1;
         }
     }

}
