package org.codewithsharon.Methods;

    class Box{ // class
        // class parameters
        int height;
        int breadth;
        int length;

         int volume(){ // non void non parameterized

            return length * height * breadth;
        }

         void printline(){ //void non parameterized
            System.out.println("---------------------------");

        }
    }
public class method_demo_object {
    public  static void main(String[] args) { // main method
        Box BlackBox = new Box();// classname objectname = new (memory allocation) classname();-->  function /method
        BlackBox.height = 10; // objectname.cls_defined_parameters=value;
        BlackBox.breadth = 5;
        BlackBox.length  = 20;
        BlackBox.volume();// method calling
        BlackBox.printline();
        System.out.println("volume of the BlackBox:  "+ BlackBox.volume());
        BlackBox.printline();
        Box WoodBox = new Box();
        WoodBox.height = 20;
        WoodBox.breadth = 15;
        WoodBox.length  = 10;
        WoodBox.volume();
        WoodBox.printline();
        System.out.println("volume of the woodBox:  "+ WoodBox.volume());
        WoodBox.printline();
    }
}
