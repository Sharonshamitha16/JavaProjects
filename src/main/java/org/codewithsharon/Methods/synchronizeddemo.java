package org.codewithsharon.Methods;
class Cakecounter extends Thread // this cls inherits from predefined thread class
{

    int cakecount =0;

    public synchronized void increment(){ //method increment is defind heree for iteration
        cakecount++;

    }
}
class Team implements  Runnable{ //
    Cakecounter counter;// creating an object clsname obj = new clsname same way only the left side done  as single variable is used by both the teams.

     Team (Cakecounter counter){//constructor crating a paramater which is assigned outside the constructor i.e is the class
    this.counter = counter;
    }

    
    public void run() {
        for (int i = 0; i<1000 ; i++){
             counter.increment();

        }

    }
}

public class synchronizeddemo {
    public static void main(String[] args) {
        Cakecounter counter = new Cakecounter();// obj  creation for Cakecounter
        Thread team1 = new Thread(new Team(counter));
        Thread team2 = new Thread(new Team(counter));
         team1.start();
         team2.start();
         try{
             team1.join();
             team2.join();
         }
         catch (Exception E){
             System.out.println(E);
         }
        System.out.println(counter.cakecount);

    }
}