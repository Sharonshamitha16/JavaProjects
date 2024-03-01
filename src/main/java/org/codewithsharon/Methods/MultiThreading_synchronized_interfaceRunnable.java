package org.codewithsharon.Methods;

class Book implements Runnable { // interface using Runnable cls

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Update the DB");

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }
}

class Num extends Thread { //extends Thread so that it uses run method and uses public specifier
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println(j);

            try {
                Thread.sleep(5000);// Thread uses try catch block
            } catch (Exception e) {

            }
        }
    }
}


public class MultiThreading_synchronized_interfaceRunnable {
    public static void main(String[] args) throws InterruptedException {
        // Runnable db= () ->{ without the method name  just body}; // this is lambda Expression.
       /* Runnable db = new Runnable() { // this is anonymous class
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println("Update the DB");

                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                    }
                }
            }
        };*/
        Runnable db =() ->{
            for (int i = 1; i < 5; i++) {
                System.out.println("Update the DB");

                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                }
            }

        };
        // db.updateDb();
        Num num = new Num();
        // num.print();
        Thread t1 = new Thread(db);
        //db.start();
        num.start();
        //db.join();
        num.join();
        System.out.println("THE END OF ........");
    }
}
