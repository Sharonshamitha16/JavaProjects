package org.codewithsharon.importantcodes;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        System.out.println("Enter a number5 to find whether it is prime no. or not: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2!=0&num%3!=0&num%5!=0&num%7!=0&num%11!=0){
            System.out.println("The entered number is a prime number");
        }
        else{
            System.out.println("The entered number is not a prime number");
        }
    }
}
