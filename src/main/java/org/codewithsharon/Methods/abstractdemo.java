package org.codewithsharon.Methods;

abstract class Computer {
    void turnon() {
        System.out.println("Turn on");
    }
    abstract void turnoff();

}

class HP extends Computer {
    void turnon() {
        System.out.println("Turn on HP computer");
    }
    void turnoff(){
        System.out.println("Turning off HP Computer");
    }
}
class Dell extends  Computer{
    void print(){
        System.out.println("Turn on DELL computer");
    }
    void turnoff(){
        System.out.println("Turning off DELL Computer");
    }
}

public class abstractdemo {
    public static void main(String[] args) {
        HP sys1 = new HP();
        sys1.turnon();
        sys1.turnoff();
        Dell sys2 = new Dell();
        sys2.print();
        sys2.turnoff();



    }
}
