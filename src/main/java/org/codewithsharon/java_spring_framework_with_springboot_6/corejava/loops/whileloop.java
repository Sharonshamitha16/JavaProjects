package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.loops;

public class whileloop {
    public static void main(String[] args) {
        int i = 1; //assignment operator

        while (i <= 5) {
            System.out.println("HI " + i);
         int   j = 1;
            while (j <= 2) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Out of the loop i value " +  i );
    }
}
// take a example saying days of week as i and hours of day as j there how a day completes in 24 hrs and start the 2nd day with 0-24 same thing
