package org.codewithsharon.importantcodes;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String name = sc.nextLine();
        boolean ispalindrome = true;
        int i = 0;
        int j = name.length() - 1;

        while (i < j) {
            if (name.charAt(i) != name.charAt(j)) {
                ispalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (ispalindrome) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("not a palindrome")     ;
        }
    }

}