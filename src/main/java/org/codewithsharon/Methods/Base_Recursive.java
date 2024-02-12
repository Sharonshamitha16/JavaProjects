package org.codewithsharon.Methods;

// to print the natural numbers in reverse using recursion
public class Base_Recursive {
    public static void main(String[] args) {
        //int n = 1;
        //int sum = 0;
        natprint(20);
    }

    // base case
    public static void natprint(int n) {
        if (n == 1) {
            System.out.print(1);
        } else {
            System.out.print(n);
            natprint(n - 1);
        }
    }
}



