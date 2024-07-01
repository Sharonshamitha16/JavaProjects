package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.array;
public class multi_dimensional_array {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        System.out.println("from for  loop");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("from for each loop");
        for (int arrayofrow[]: nums){
             for (int fromarrayofrowtakingcol : arrayofrow)
             {
                 System.out.print(fromarrayofrowtakingcol +" ");
             }
            System.out.println();
        }
    }
}