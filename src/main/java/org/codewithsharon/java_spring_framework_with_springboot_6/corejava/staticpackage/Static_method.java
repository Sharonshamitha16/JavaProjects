package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.staticpackage;
class  Mobile1{
    String  brand;
    int price; //instance variables
    static String name;
    public void show(){
        // local variables
        System.out.println( "BRAND : " + brand +" PRICE :" + price + " MODEL : "  + name);
    }
    public  static void show1(Mobile1 sample){
        System.out.println( "static method says ..... BRAND : " + sample.brand +" PRICE :" + sample.price + " MODEL : "  + sample.name);
    }
}
public class Static_method {
    public static void main(String[] args) {
        Mobile1 obj = new Mobile1();
        obj.name="smart phone";
        obj.price=1300;
        obj.brand="Apple";

        Mobile1 obj2 = new Mobile1();
        obj2.name="flip phone";
        obj2.price=1200;
        obj2.brand="Samsung";

        Mobile1.name="touch phone";
        obj.show();
        obj2.show();

        System.out.println(" ");
        Mobile1.show1(obj);
        Mobile1.show1(obj2);
    }

}
