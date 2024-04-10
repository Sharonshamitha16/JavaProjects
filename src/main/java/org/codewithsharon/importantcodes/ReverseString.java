package org.codewithsharon.importantcodes;

import java.util.Scanner;

//public class ReverseString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the string which you wanna reverse: ");
//         String name = sc.nextLine();
//         String rev ="";
//         int len = name.length()-1;
//         for(int i=0;i<=len;i++){
//             rev=String.valueOf(name.charAt(len-i));
//             System.out.print(rev);
//         }
//
//    }
//
//}

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String name = sc.nextLine();
      //  String [] words = name.split("\\s+");

        StringBuilder firstrev =new StringBuilder(name).reverse();
//        StringBuilder secrev =new StringBuilder(words[1]).reverse();

        System.out.println( "reversed string is :"+firstrev +" "); //+secrev);


    }

    }

