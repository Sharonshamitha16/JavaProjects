package org.codewithsharon.ds;

import java.util.Arrays;

public class linearsearchmain {
    public static void main(String[] args) {
        int [] arr={2,4,1,6,9,34,633,823,223,5};
        System.out.println(LinearSearchfns.find(arr,9));
        System.out.println(LinearSearchfns.contains(arr,4));
        String name ="shami is a gud girl.";
        System.out.println(LinearSearchfns.find(name, 'h'));
        System.out.println(LinearSearchfns.contains(name, 's'));
        int [][]twoarr = {
                {2,3,5},
                {3,4,5,6},
                {7,8,9,12},
                {9,11,21}
        };
        System.out.println(Arrays.toString(LinearSearchfns.find(twoarr, 3  )));
        System.out.println(LinearSearchfns.find_min_max(arr,223));
        System.out.println(LinearSearchfns.countval(arr));
        System.out.println(LinearSearchfns.countstr(name) +" is the count of the given word..");
    }
}
