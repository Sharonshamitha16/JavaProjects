package org.codewithsharon.Methods;

import java.util.Scanner;


public class Sumofdigits_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to find the sum of digits:");
        int num = scanner.nextInt();

        int sum = Sumofdigits_Method(num);
        System.out.println("the entered sum of digits is:" + sum);


    }

    public static int Sumofdigits_Method(int num) {
        int sum = 0;
        while (num != 0) {

            sum += num % 10;
            num /= 10;

        }
        return sum;
    }
}

