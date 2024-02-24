package org.codewithsharon.Methods;
class cakes extends Thread{
    public void run(){
        System.out.println("CAKE INGREDIENTS MIXING " + Thread.currentThread().getId());
        System.out.println("CAKE BAKING " + Thread.currentThread().getId());
        System.out.println("CAKE DECORATION " + Thread.currentThread().getId());
        System.out.println("CAKE DELIVERY " + Thread.currentThread().getId());
    }

}
 class cakeflavour extends  cakes implements Runnable{
     public void flavour(){
         System.out.println("chocolate flavour cake mixing"+cakes.currentThread().getId());
     }
 }
public class Multithrading_interface_runnable {
    public static void main(String[] args) {
        int cakecount= 4;
        for(int i =0; i<cakecount;i++){
            cakeflavour flavor = new cakeflavour();
            Thread work = new Thread(flavor);
            work.start();
        }

    }
}
