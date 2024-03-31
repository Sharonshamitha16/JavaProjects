package org.codewithsharon.ds;
public class Reverseint {
    public static void main(String[] args) {
        int reversed=0;
        int remainder=0;
        int n=1234;
        while(n>0){
            remainder=n%10;
            n=n/10;
            reversed = reversed*10+remainder;
            System.out.println(reversed);
            System.out.println();
        }
        System.out.println(reversed +" outside of loop");
    }
}
