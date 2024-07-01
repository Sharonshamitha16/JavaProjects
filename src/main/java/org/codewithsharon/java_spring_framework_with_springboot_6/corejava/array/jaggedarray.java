package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.array;

public class jaggedarray {
    public static void main(String[] args) {
        int num[][] = new int [3][];
        num[0]= new int[3];
        num[1]= new int[4];
        num[2]= new int[2];
        for(int row=0;row< num.length;row++){
            // 8 0 4
            // 3 2 1 5
            // 2 7
           // 8 ,3,2 are considered to be row thats why
            // row.length same way row's length will be column so col(row)length
            for(int col=0;col<num[row].length;col++){
                num[row][col]=(int)(Math.random()*10);// why random is type casted bcoz random fn is in double  data type so ,
                System.out.print(num[row][col] + " ");
            }
            System.out.println();
        }
     //for each loop
        System.out.println("from for each loop");
        for(int arrayrow[]: num){ // single array
            for(int arrayrowfromcol: arrayrow){
                System.out.print(arrayrowfromcol + " ");
            }
            System.out.println();
        }
    }
}
