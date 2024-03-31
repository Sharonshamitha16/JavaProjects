package org.codewithsharon.importantcodes;

//import static org.codewithsharon.Methods.fact_recursion.fact;

import java.util.Scanner;

public class factorial {

        static int fact (int n){
            if(n==0){
                return 1;
            }
            else{
                return n*fact(n-1);
            }

        }
    public static void main(String[] args) {
            int n=5;
        System.out.println(fact(5));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the factorial number:");
        int n1= sc.nextInt();

        int temp;
        int fact =1;
        while(n1<1){
            fact= fact*n1;
            n1=n1-1;

        }
        System.out.println("factorial of "+n1+" is "+ fact(n1));
    }
}
