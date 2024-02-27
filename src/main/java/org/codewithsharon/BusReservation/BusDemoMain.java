package org.codewithsharon.BusReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemoMain {
    public static void main(String[] args) {
        ArrayList <Bus>  buses =new ArrayList<Bus>();
        buses.add(new Bus(1,true,50));
        buses.add(new Bus(2,true,34));
        buses.add(new Bus(3,false,44));

        int Useropt = 1;
        Scanner scanner =  new Scanner(System.in);
        while(Useropt==1){

            System.out.println("Enter 1 to book and 2 to exit");
            Useropt=scanner.nextInt();
            if(Useropt==1){
                System.out.println("Booking....");
            }
            else{
                System.out.println("Thank you for Booking Visit again for booking");
            }
        }

    }
}
