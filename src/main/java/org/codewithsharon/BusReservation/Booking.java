package org.codewithsharon.BusReservation;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking {
    private String passengerName;
    private int busNo;
    private Date date;


    Booking() { //constructor from cls
        // passenger,busno,date details from user using scanner i/p
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the passenger name:");
        passengerName = scanner.next();
        System.out.println("Enter bus no:");
        busNo = scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = scanner.next(); // getting the date as string as we used dat as object

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        // this string is changed as date format so we used simpledateformat cls and created the obj which we used for string to convert
        try {
            date=dateFormat.parse(dateInput);
        }
         catch (Exception e) {
             System.out.println("Re-enter the date properly");
        }


    }

    public boolean isAvailable(ArrayList<Bus> busesarr, ArrayList<Booking> bookingsarr) {
// booking isavaialble method created in booking cls as it's there are not here boolean datatype is used
//needed booking details and bus details as it's declared as aaraylist it's been called as referance
        int capacity = 0; //initalizing as 0
        int booked = 0;
        for (Bus bus : busesarr) { // for each loop Bus class creating bus as obj to  for "foreach" : from busesarr where we added th details
            if (bus.getbusNo() == busNo) { // obj of foreach .getbusNo is equal then
                capacity = bus.getCapacity(); //getting capacity of us in capacity
            }
            booked = 0;
            for (Booking b : bookingsarr) {   //  same way, for each loop Booking class creating b as obj to  for "foreach" : from busesarr where we added th details
                if (b.busNo == busNo && b.date.equals(date)) { // if both are equal then booking gets iterated
                    booked++;
                }


            }

        }

        return booked<capacity?true:false; // this is  conditional operator saying if booked value is lesser than the capacity then return as tru orelse false.
    }
}