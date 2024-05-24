package org.codewithsharon.Methods;

    class  Box{ // class
        // class parameters
        int height;
        int breadth;
        int length;

         Box(int i, int i1, int i2) {
             height=i;
             length=i1;
             breadth=i2;
        }
        Box(){}

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
//        WoodBox.height = 20;
//        WoodBox.breadth = 15;
//        WoodBox.length  = 10;
        WoodBox.volume();
        WoodBox.printline();
        System.out.println("volume of the woodBox:  "+ WoodBox.volume());
        WoodBox.printline();
    }
}
// class Box {
//    // Private instance variables
//    private int height;
//    private int breadth;
//    private int length;
//
//    // Parameterized constructor
//    public Box(int height, int breadth, int length) {
//        this.height = height;
//        this.breadth = breadth;
//        this.length = length;
//    }
//
//    // Default constructor
//    public Box() {
//        // Default constructor with no parameters
//        // This constructor can be used to create Box objects with default values
//        this.height = 0;
//        this.breadth = 0;
//        this.length = 0;
//    }
//
//    // Public method to calculate volume
//    public int calculateVolume() {
//        return length + height * breadth;
//    }
//
//    // Public method to print a line
//    public void printLine() {
//        System.out.println("---------------------------");
//    }
//
//    // Getter methods for private instance variables
//    public int getHeight() {
//        return height;
//    }
//
//    public int getBreadth() {
//        return breadth;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    // Setter methods for private instance variables
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public void setBreadth(int breadth) {
//        this.breadth = breadth;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//}
//
//public class method_demo_object {
//    public static void main(String[] args) {
//        // Creating objects of Box class
//        Box blackBox = new Box(10, 5, 20); // Parameterized constructor
//        Box woodBox = new Box(); // Default constructor
//
//        // Accessing private instance variables using getter methods
////        System.out.println("Height of blackBox: " + blackBox.getHeight());
////        System.out.println("Breadth of blackBox: " + blackBox.getBreadth());
////        System.out.println("Length of blackBox: " + blackBox.getLength());
//
//        // Accessing private instance variables using setter methods
//        woodBox.setHeight(20);
//        woodBox.setBreadth(15);
//        woodBox.setLength(10);
//
//        // Printing calculated volume
//        System.out.println("Volume of blackBox: " + blackBox.calculateVolume());
////        System.out.println("Volume of woodBox: " + woodBox.calculateVolume());
//
//        // Printing a line
//        blackBox.printLine();
////        woodBox.printLine();
//    }
//}
