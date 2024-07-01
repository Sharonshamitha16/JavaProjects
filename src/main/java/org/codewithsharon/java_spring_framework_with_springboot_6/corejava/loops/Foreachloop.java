package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.loops;

public class Foreachloop {
    public static void main(String[] args) {
        int num []  = new int [5];
        num[0] = 1;
        num[1]= 200;
        num[2]= 77;
        num [3]=02;
        num[4]=55;
        for ( int newnums : num){
            System.out.println(newnums);
         }
    }

}
