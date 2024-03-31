package org.codewithsharon.importantcodes;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find the odd or even number:");
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.println(num + " entered number is even");
        }else{
            System.out.println(num+" entered number is odd");
        }
    }
}
