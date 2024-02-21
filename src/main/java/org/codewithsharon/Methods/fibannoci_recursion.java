package org.codewithsharon.Methods;

public class fibannoci_recursion {
    // 0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21,21+13=34,13+34=47.......
    //0,1,2,3,5,8,13,21,34,47......
    static int fib(int n) {
    if (n<=1){

        return n;
    }
    else{
        return fib(n-1)+ fib(n-2);
    }
    }

    public static void main(String[] args) {
        for (int i=0;i<=3;i++)
        {
            System.out.print( fib(i)+",");
        }



    }
}
