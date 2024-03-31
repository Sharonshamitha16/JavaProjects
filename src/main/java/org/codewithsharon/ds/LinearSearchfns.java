package org.codewithsharon.ds;

import java.util.Arrays;

public class LinearSearchfns {
    public static int find (int[]arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;

        }
        return -1;
    }
    public static boolean contains (int[]arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return true;

        }
        return false;
    }
    public static int find (String str, char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target)
                return i;

        }
        return -1;
    }
    public static boolean contains (String str, char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target)
                return true;

        }
        return false;
    }

    public static int[] find (int [][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                return new int [] {row,col};
            }
        }
        return new int[] {-1,-1};
    }

    public static boolean  find_min_max (int []arr, int target) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr.length)
                return true;

        }
        return false;
    }

    public static int countval (int []arr){
        int count =0;
        for (int i = 0; i < arr.length; i++)
            if(arr[i]>=100&& arr[i]<=999)
                 count++;
        return count;
    }
    public static  int countstr (String str){
        for(int i =0; i<str.length();i++){
           // if(str.charAt(i))

        }
        return-1;
    }


}
