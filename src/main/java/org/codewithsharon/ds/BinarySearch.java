//package org.codewithsharon.ds;
//
//public class BinarySearch {
//    public class  search(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length-1;
//        int mid = start + end / 2; //{1,3,5,6,10,12,15,20,27,28} tar=15
//        for (int i = 0; i < arr.length; i++) { //if the given list is asc then
//            if (target > arr[mid]) { // target >mid then focus on right side
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                start = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//
//    }
//}