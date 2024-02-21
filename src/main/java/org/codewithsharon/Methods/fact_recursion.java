package org.codewithsharon.Methods;

public class fact_recursion {
    static int fact(int n){
        if (n==0){//5==0-false,0==0,==>1
            return 1;
        }
        else {//5*fact(5-1)=5*fact(4),20*fact(4-1)=20*fact(3),60*fact(3-1)=2,120*fact(2-1)=1,120*fact(1-1)=5*fact(0)
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("factorial of the given  number is :"+fact(5));
    }
}
