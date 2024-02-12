package org.codewithsharon.DummyFolder;

import java.util.Scanner;

public class SecondFile {
    public static class Palindrome {
        public static void main(String[] args) {
            //String Ipstring = "madam";
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER  A STRING:");
            String Ipstring = scanner.nextLine();
            int n = Ipstring.length();

            for (int i = 0, j = n - 1; i < j; i++, j--)
            {

                if (Ipstring.charAt(i) != Ipstring.charAt(j)) {
                    System.out.println("GIVEN STRING IS  A PALINDROME");
                } else {
                    System.out.println("GIVEN STRING IS NOT PALINDROME");
                }

            }


            //        see youtube maven structure and example.
        }
    }
}
