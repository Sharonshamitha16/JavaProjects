package org.codewithsharon.ds;
import java.util.*;

public class Anagramproblem {

        public boolean solve(char[] s1, char[] s2) {

            // you get the s1 and s2 strings (char sequences) and you have to return true (if they are anagram) or false otherwise
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st word: ");
            String clearedstring1 = sc.nextLine(); //= str1.replaceALL("[^a-zA-Z]","");
            System.out.println("Enter 2st word: ");
            String clearedstring2 = sc.nextLine();//= str2.replaceALL("[^a-zA-Z]","");
            if(clearedstring1.length()!= clearedstring2.length()){
                return false;
            }

            s1 = clearedstring1.toCharArray();
            s2= clearedstring2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            for(int i =0; i<clearedstring2.length();i++)
                if(Arrays.equals(s1,s2)){
                    return true;//+" the given 2 words are anagrams..";
                }
            return false;//+"the given 2 words are not anagrams..";

        }
        public static void main (String[]args){
            Anagramproblem ex = new Anagramproblem();
            System.out.println(ex.solve("ADAM".toCharArray(), "MADA".toCharArray()));

        }
    }

