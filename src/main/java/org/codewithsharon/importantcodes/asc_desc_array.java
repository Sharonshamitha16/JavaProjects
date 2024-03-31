package org.codewithsharon.importantcodes;

import java.util.Arrays;

public class asc_desc_array {
    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 1, 7, 9, 1, 6};
        Arrays.sort(arr);
        System.out.println("Ascending order of the given array is :" + Arrays.toString(arr));
        for (int i = 0; i < arr.length /2; i++) {
        int temp = arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=temp;
        }
        System.out.println("Descending order of the given string is :"+Arrays.toString(arr) );

    }

}
