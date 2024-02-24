package org.codewithsharon.Methods;
   class cake extends Thread{
     public void run(){
         System.out.println("CAKE INGREDIENTS MIXING " + cake.currentThread().getId());
         System.out.println("CAKE BAKING " + cake.currentThread().getId());
         System.out.println("CAKE DECORATION " + cake.currentThread().getId());
         System.out.println("CAKE DELIVERY " + cake.currentThread().getId());
     }

 }
public class Threadbaking {
    public static void main(String[] args) {

        int cakecount =4;
        for( int i=0; i<cakecount; i++){
            cake threads = new cake();
            threads.start();
        }


    }
}
