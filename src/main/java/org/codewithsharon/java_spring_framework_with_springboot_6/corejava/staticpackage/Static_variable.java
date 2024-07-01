package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.staticpackage;
class  Mobile{
    String  brand;
    int price;
   static String name;
     public void show(){
         System.out.println( "BRAND : " + brand +" PRICE :" + price + " MODEL : "  + name);
     }
}
public class Static_variable {
    public static void main(String[] args) {
         Mobile obj = new Mobile();
         obj.name="smart phone";
         obj.price=1300;
         obj.brand="Apple";

        Mobile obj2 = new Mobile();
        obj2.name="flip phone";
        obj2.price=1200;
        obj2.brand="Samsung";

        Mobile.name="touch phone";
        obj.show();
        obj2.show();
    }

}
