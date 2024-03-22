package org.codewithsharon.Methods;

public class stack_int {
    int s[] = new int[10];
    int topofstack;

    stack_int() {
        topofstack = -1;
    }

    void push(int item) {
        if (topofstack == 9)
        {
            //s[topofstack] = s[topsofstack+1];
            System.out.println("Stack is full");
        }
        else
        {
            s[++topofstack] = item;

        }
    }

    int pop() {
        if (topofstack >= 0) {
            return s[topofstack--];
        } else {
            System.out.println("stack is empty");
            return -1;
        }
    }
}
