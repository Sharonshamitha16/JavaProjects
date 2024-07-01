package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.String;

public class ImmutableString {
    public static void main(String[] args) {
        String name ="sharon"; // here this name has a seperate memeory allocation
        name = name +" shamitha";// this also has seperate memory allocation
        System.out.println(name); // lastly changed would be the o/p the 1st one gets deleted by garbage collector
        String s1= "sam";
        String s2 = "sam"; // this won't take 2 seperate places a sthe object value is same
        // it get stored in string constant pool so it refers the same value

        System.out.println(s1==s2);
    }
}
