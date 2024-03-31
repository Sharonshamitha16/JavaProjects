package org.codewithsharon.importantcodes;

import java.util.*;

public class removalofduplicates
{
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,78,89};

        String arr1[] ={"sam", "sarav", "saki","sharon","sarav","sam","saki","shami"};
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList<String> liststr = new ArrayList<>();

        for(int num: arr){
            list.add(num);
        }
        for(String str:arr1){
            liststr.add(str);
        }
        Set<Integer> set =new HashSet<Integer>(list);
        list.clear();
        list.addAll(set);
         int [] result = new int[list.size()];
         for(int i =0;i<list.size();i++){
             result[i]=list.get(i);


         }
        System.out.println(Arrays.toString(result
        ));
         Set <String> set2 = new HashSet<>(liststr);
         liststr.clear();
         liststr.addAll(set2);
         String [] result1 = new String [liststr.size()];
         for (int i= 0;i<liststr.size();i++){
             result1[i]=liststr.get(i);
         }
        System.out.println(Arrays.toString(result1));
        System.out.println(Math.sqrt(17));
    }
}
