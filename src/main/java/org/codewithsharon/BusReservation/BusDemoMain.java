package org.codewithsharon.BusReservation;
import java.awt.print.Book;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemoMain {
    public static void main(String[] args) {
        ArrayList <Bus>  busesarr =new ArrayList<Bus>();
        // creating  array list using collections of java as Bus -clsname buses as objectname  same way Booking as cls name and booking as objectname.
        ArrayList<Booking> bookingsarr = new ArrayList<Booking>();

        busesarr.add(new Bus(1,true,2)); // objname.add() method from arraylist
        busesarr.add(new Bus(2,true,34));// objname.add() method from arraylist
        busesarr.add(new Bus(3,false,44));// objname.add() method from arraylist

        for(Bus b:busesarr){ // for each loop arraylist clsname and an obj b is created : obj of respective clsname given at the left
           b.displayInfo(); // displaying from Bus cls ,  in busesarr obj where we have declared th count of busno, ac availability and  capacity of the bus
        }
        int Useropt = 1; //initializing useroption as 1
        Scanner scanner =  new Scanner(System.in); // getting i/p from user as which option either 1 to have bus booking or 2 to exit
        while(Useropt==1){ // when it's 1
            System.out.println("Enter 1 to book and 2 to exit");
            Useropt=scanner.nextInt(); // to store in useropt variable
            if(Useropt==1){ // if its 1 then
                Booking booking =new Booking(); // creating an obj for booking cls
                    if(booking.isAvailable(busesarr,bookingsarr))
                    { // then if  there is  any availability
                    bookingsarr.add(booking); // adding the booking
                    System.out.println(" Your Booking is confirmed...."); // print
                         }
                    else{ // if not
                    System.out.println(" Sorry Bus you have asked for is full on the mentioned date. please go for any other bus in our booking reservation or go for any other slot...!! ");
                }
                   /* else{
                    System.out.println("Thank you for Booking, Visit again for booking");*/

                }
            }

        }

    }

