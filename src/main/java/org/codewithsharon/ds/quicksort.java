package org.codewithsharon.ds;

public class quicksort {
    public static void quick(int arr[], int low, int high) {

        int start = low;
        int end = high;
        int mid = (low + high) / 2;
        int pivot = arr[end];
        if (low >= high) {
            return;
        }
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }


            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            quick(arr, low, end);
            quick(arr, start, high);
        }
    }
}
