package org.codewithsharon.ds;

import java.util.ArrayList;
import java.util.List;

public class arraylistdemo {
    public static void main(String[] args) {
        List <String> names  = new ArrayList<>();
        names.add("sam");
        names.add("sharon");
        names.add("saki");
        names.add("saravanan");
        names.remove("sam");//this makes o(N)
        //names.remove(1);
        System.out.println("names present in list: "+names.get(0));
        System.out.println(names.size());
        for (String name: names){
            System.out.println(name);
        }
    }
}
