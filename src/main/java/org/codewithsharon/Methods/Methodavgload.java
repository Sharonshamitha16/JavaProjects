package org.codewithsharon.Methods;

public class Methodavgload {
    static  int avg (int a, int b){
        return a+b/2;
    }
    static int avg (int a , int b, int c){
        return a+b+c/3;
    }
    public static void main(String[] args) {
        System.out.println("Avg of 3 numbers:"+avg(2,3,2));
        System.out.println("avg of 2 numbers"+avg(4,5));

    }
}
