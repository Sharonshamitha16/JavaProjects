package org.codewithsharon.Anudip_excercises;
import java.util.Scanner;
public class palindrome {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check whether it is palindrome or not:");
        String inputString = scanner.nextLine();
        for (int i = 0, j = inputString.length() - 1; i < j; i++, j--) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                System.out.println(" It is  not a palindrome ");
            }
            else
            {
                System.out.println("It is a palindrome");
            }
            scanner.close();
        }
    }
}

