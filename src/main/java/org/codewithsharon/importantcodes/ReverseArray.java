package org.codewithsharon.importantcodes;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        reversearr(arr);
        System.out.println(Arrays.toString(arr));

    }
public static void reversearr(int[] arr){
 int start =0;
 int end = arr.length -1;
 while(start<end){
     int temp =arr[start];
     arr[start]= arr[end];
     arr[end]=temp;
     start++;
     end--;
 }


}
}

