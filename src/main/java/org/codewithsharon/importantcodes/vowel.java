package org.codewithsharon.importantcodes;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the alphabet to find vowel or not:");
        char vowel;
        vowel= sc.next().charAt(0);
        switch(vowel){
            case 'a':
            case 'e':
            case 'i':
            case'o':
            case'u':
                System.out.println("Its a vowel");
                break;
                default:
            {
                System.out.println("its a consonant");
            }

        }
    }
}
