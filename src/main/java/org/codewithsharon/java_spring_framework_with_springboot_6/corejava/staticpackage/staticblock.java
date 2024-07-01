package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.staticpackage;



class Mobile3{
    String  brand;
    int price;
     static String name;

    static{
        name ="phone";
        System.out.println(" from static block");
    }
    Mobile3(){
        brand ="";
        price =200;
        System.out.println("from constructor");
    }
    public void show(){
        System.out.println( "BRAND : " + brand +" PRICE :" + price + " MODEL : "  + name);
    }
}

public class staticblock {
    public static void main(String[] args) throws ClassNotFoundException {


        /*** if we have no obj created for class still we need to load
         * the class ( static class is loaded by class loader once that why
         * even we tried to create 2 obj we had
            only one static block o/p  ***/



      //-------------------  Class.forName(Mobile3);// helps to load the class----------------------
//        Mobile3 obj = new Mobile3();
//        obj.name="smart phone";
//        obj.price=1300;
//        obj.brand="Apple";
//        obj.show();
//         Mobile3 obj2  = new Mobile3();
//         obj2.show();
    }
}
