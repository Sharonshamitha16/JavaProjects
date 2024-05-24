package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.loops;
/* printing days from monday to friday 9am-6pm, railway time*/
public class forloop {
    public static void main(String[] args) {
        int  num = 5;
        for(int i=1;i<=5;i++){
            System.out.println( " DAY " +i);
            for (int j = 0; j <9 ; j++) {
                System.out.println( (j+9) +" am to "+ (j + 10) +" pm");

            }
        }
    }
}
