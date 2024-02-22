package org.codewithsharon.Methods;
 class Mother{// single inheritance
     char gender ='F';
       void print(){
         System.out.println("MOTHER FROM PARENT CLASS MENTIONED AS STATIC");
     }
 }
 class Daughter extends  Mother{
     char gender ='M';
     void print(){
         System.out.println("DAUGHTER FROM CHILD CLASS OR BASE CLASS");
     }
 }
 class Grandaughter extends Daughter{
     //String gender= "female from granddaughter class";
     void Print() {
         System.out.println("GRAND DAUGHTER FROM THE MULTI LEVEL CLASS INHERITED FROM THE CHILD CLASS OF MOTHER BUT PARENT CLASS OF GRAND DAUGHTER");
     }
 }
 class Grandson extends Daughter{
      String gender = "Male";

 }
public class Inheritance {
    public static void main(String[] args) {
        Mother M = new Mother();
        M.print();
        Daughter d = new Daughter();
        d.print();
        System.out.println(d.gender);
        Grandaughter G = new Grandaughter();
        System.out.println(M.gender);
        G.print();
        //              Mother.print();



    }
}
