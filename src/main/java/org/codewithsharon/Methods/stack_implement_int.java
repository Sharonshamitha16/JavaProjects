package org.codewithsharon.Methods;

public class stack_implement_int {
    public static void main(String[] args) {
        stack_int s1 =new stack_int();
        s1.push(5);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        System.out.println(s1.pop());
        stack_char c1 = new stack_char();
        c1.push('s');
        c1.push('h');
        c1.push('a');
        c1.push('r');
        c1.push('o');
        c1.push('n');
        c1.push('s');
        System.out.println( c1.pop());
    }
}
