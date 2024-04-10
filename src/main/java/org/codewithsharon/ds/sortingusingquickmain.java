package org.codewithsharon.ds;

import java.util.Arrays;

public class sortingusingquickmain {
    public static void main(String[] args) {
         int []inp = {4,1,2,5,3};
        quicksort.quick(inp,0,inp.length-1);
        System.out.println(Arrays.toString(inp));
    }
}
