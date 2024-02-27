package org.codewithsharon.Methods;

import java.sql.SQLOutput;

class cookie extends Thread {
    public void run() {
        try
        {
            System.out.println("COOKIE INGREDIENTS MIXING " + cake.currentThread().getName());
            System.out.println("COOKIE BAKING " + cake.currentThread().getName());
            System.out.println("COOKIE DECORATION " + cake.currentThread().getName());
            System.out.println("COOKIE DELIVERY " + cake.currentThread().getName());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

    public class PredefinedMethodThread {
        public static void main(String[] args) {

            int cakecount = 4;
            for (int i = 0; i < cakecount; i++) {
                cookie reaction = new cookie();
                reaction.start();
               // cookie.setName( "CAKE"+(i+1));
                try {
                    if (i == 1) {
                        //cookie.sleep(2222);
                        System.out.println();
                    }
                }
                catch(Exception E){

                }

                reaction.setPriority(Thread.MAX_PRIORITY);
                System.out.println(reaction.getPriority());
                System.out.println(cookie.currentThread().isAlive());

            }
            System.out.println("Outside of the outside loop");

        }

    }


