package org.codewithsharon.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class list {
    public static void main(String[] args) throws InterruptedException {
        int list1[] = new int[5];
        ArrayList<Integer> arraylistint = new ArrayList<Integer>();
        System.out.println(arraylistint.add(5));//adding
        System.out.println(arraylistint.get(0));//retriving and printing
        System.out.println(arraylistint);//to print lists
        arraylistint.add(1,2);//adding by index
        arraylistint.add(2,7);//adding by index
        arraylistint.add(3,3);//adding by index
        System.out.println(arraylistint);
        arraylistint.set(3,5);//update
        System.out.println(arraylistint);
      //  System.out.println();
      //  arraylistint.clone();
        arraylistint.contains(5);//there r not
       arraylistint.equals(3);
        // arraylistint.ensureCapacity(5);
        //arraylistint.iterator();
        // arraylistint.addFirst(1);
        ///arraylistint.reversed();
        //arraylistint.wait(1);
        // arraylistint.notifyAll();
        // arraylistint.getClass();
        // arraylistint.stream().unordered();
        // arraylistint.stream().sorted();
        //arraylistint.getFirst();
        //arraylistint.getLast();
        arraylistint.size();
        for(int i :arraylistint){
            System.out.println(i);
        }
      //  System.out.println("/n");
        ArrayList<String> arrayliststr = new ArrayList<>();
       arrayliststr.add("sam");
       arrayliststr.add("shami");
       arrayliststr.add("sarav");
       arrayliststr.add("joel");
       arrayliststr.add("saki");
        System.out.println("Foreach loop using this ");
        System.out.println(arrayliststr);
        for(String s : arrayliststr){
            System.out.println(s);
        }
        Iterator<String> itr = arrayliststr.iterator();
        System.out.println("Using Itreator: ");

        itr.next();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        LinkedList <Integer>linklist =new LinkedList<>();
        linklist.add(30);
        linklist.add(1,90);
        linklist.add(2,77);
        linklist.add(3,88);
        System.out.println(linklist);
    }
}

