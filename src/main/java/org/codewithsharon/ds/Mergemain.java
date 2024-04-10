package org.codewithsharon.ds;

import java.util.Arrays;

public class Mergemain {
    public static void main(String[] args) {
        int [] arr ={4,5,1,2,8,9,3,6,7,12,14,17};
         arr = Mergesorting.mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
