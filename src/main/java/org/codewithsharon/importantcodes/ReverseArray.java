package org.codewithsharon.importantcodes;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        reversearr(arr);
        reversearrusingforloop(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));

    }

    public static void reversearr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void reversearrusingforloop(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (arr[start] = 0; arr[start] <= arr[end]; arr[start]++) {
            System.out.print(arr.length - arr[start] + " ");
        }

    }

}


