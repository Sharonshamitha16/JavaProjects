package org.codewithsharon.DummyFolder;


import java.util.Scanner;

public class SecondFile {

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
            //System.out.println(DummyClass());
        }
    }
}

