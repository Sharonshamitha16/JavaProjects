package org.codewithsharon.Methods;


public class Digits_of_sum_inbulitIP {
    public static void main(String[] args) {
        digitssumtemplate Sumofdigits1object = new digitssumtemplate();
        Sumofdigits1object.num = 123;
        Sumofdigits1object.calculate_digitsofsum(123);

        digitssumtemplate Sumofdigits2object = new digitssumtemplate();
        int obj1 = Sumofdigits2object.num = 456;
        int obj2 = Sumofdigits2object.calculate_digitsofsum(456);
        System.out.println("-------------------------------");
        System.out.println(" The sum of digits for the given number is :" + Sumofdigits1object.calculate_digitsofsum(123));
        System.out.println(" The sum of digits for the given number is :" + Sumofdigits2object.calculate_digitsofsum(456));
        System.out.println("obj1 is :" + obj1);
        System.out.println("obj2 is:" + obj2);
        System.out.println("---------------------------------");


    }
}
