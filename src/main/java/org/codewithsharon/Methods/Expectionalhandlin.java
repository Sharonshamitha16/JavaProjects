package org.codewithsharon.Methods;


public class Expectionalhandlin  {
    static  void check(int age) throws Exception {
        if (age < 18) {
            throw new Exception("age is invalid");
        }

    }
    public static void main(String[] args) {
         int a= 5;
         int b=0;
         try{
             check(19);
             System.out.println( "a divides b is: " +a/b);

         } catch (ArithmeticException e) {
             System.out.println(e+" AS B IS 0 IT'S AN ARITHMETIC EXCEPTION");

         }
         catch (Exception e1){
             System.out.println(e1.getMessage());
         }
         //System.out.println("out of the try catch block");
         finally{
            System.out.println("I print the statement from finally block always  ");
        }
    }


}
