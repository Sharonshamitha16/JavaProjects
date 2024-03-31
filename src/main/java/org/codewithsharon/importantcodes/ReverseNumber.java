package org.codewithsharon.importantcodes;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to reverse :");
    int num = sc.nextInt();
    int remainder=0;
    int reversed=0;
    while(num>0){
        remainder= num%10;
        num=num/10;
        reversed =reversed*10+remainder;
    }
        System.out.print("Reversed number is:"+reversed);
    }
}
