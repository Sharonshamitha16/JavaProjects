package org.codewithsharon.importantcodes;

public class fibannoci {
    public static void main(String[] args) {
        int n = 10, firstnum = 0, secondnum = 1, nextnum;
        System.out.println("From normal fibannoci series: ");


        for (int i = 0; i <= n; i++) {
            System.out.print(firstnum+",");
        nextnum= firstnum+secondnum;
        firstnum=secondnum;
        secondnum=nextnum;
        }
        System.out.println();
        System.out.println("From normal fibannoci_recursion series: ");
        for (int i =0;i<=20;i++){
            System.out.print(fibannoci_rec(i)+",");
        }
    }
    public static int  fibannoci_rec(int n1){
        if(n1<=1){
            return n1;
        }
        else {
            return fibannoci_rec(n1-1)+(n1-2);
        }

    }
}
