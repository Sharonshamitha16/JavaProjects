package org.codewithsharon.Methods;

public class printmsgbox {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            System.out.print(" _ ");
        }
        for (int i = 0 ; i < 5; i++) {
            if (i == 3) {
                System.out.println("|     welcome msg    ");
                continue;
            }
            System.out.println('|');

        }

        for (int j = 0; j < 10; j++) {
            System.out.print(" _ ");
        }
    }
}
/*for(int k=0; k<10; k++){
        System.out.println(" ");
            for (int l=0;l<1;l++){
        System.out.println("|");
            }*/
