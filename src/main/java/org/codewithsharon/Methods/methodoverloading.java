package org.codewithsharon.Methods;
 public class methodoverloading {
     static int max (int a , int b){// without declaring obj so static used
         return a<b?a:b; //Math.min(a,b);
     }
     static double max (double a , double b){// without declaring obj so static used
         //return a<b?a:b; //Math.min(a,b);
         return Math.max(a,b);
     }
    public static void main(String[] args) {
        System.out.println(max (5,7));
        System.out.println(max(5.5,8.3));
        System.out.println(Math.abs(-9.2));
    }


 }
