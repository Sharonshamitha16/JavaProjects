package org.codewithsharon.Methods;

import org.w3c.dom.ls.LSOutput;

public class Subarray {
    public static void main(String[] args) {


        int start = 0;
        int currsum = 0;
        int i, reqsum = 10;
        int[] arr = {2, 3, 2, 4, 5, 1, 6, 6, 7, 8};

        for (i = 0; i < arr.length; i++) {
            currsum+=arr[i];
            while (currsum > reqsum) {
                currsum =currsum- arr[start];
                start++;


            }
            if (currsum == reqsum) {
                System.out.println("sum of indexes are  from " + start + " btw " + i);
                return;
            }
            else{
                System.out.println(" No subarray found");

            }

        }

    }

}