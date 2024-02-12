package org.codewithsharon.Methods;
public class method_demo_object {
    class Box{
        int height;
        int breath;
        int length;

        static int volume(){
            int volume = length * height * breath;
            return volume();
        }

        static String printline(){
            System.out.println("---------------------------");
            return printline();
        }
    }
    public void main(String[] args) {
        Box BlackBox = new Box();
        int height = 10;
        int breadth = 5;
        int length  = 20;
        BlackBox.volume();
        BlackBox.printline();
        System.out.println("volume of the BlackBox:  "+ BlackBox.volume());

        Box WoodBox = new Box();
        int height = 20;
        int breadth = 15;
        int length  = 10;
        WoodBox.volume();
        WoodBox.printline();
        System.out.println("volume of the woodBox:  "+ WoodBox.volume());

    }
}
