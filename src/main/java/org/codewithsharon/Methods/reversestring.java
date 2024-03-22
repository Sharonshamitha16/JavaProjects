package org.codewithsharon.Methods;

import static java.lang.Integer.*;

public class reversestring {
    public static void main(String[] args) {
        String s = "sharon";
        int len =s.length() -1;
        String rev = "";

        for(int i=0;i<=len;i++) {
            rev= String.valueOf(s.charAt(len-i));
            System.out.print(rev);
        }

    }
}
