package org.codewithsharon.BusReservation;

public class Bus {
     private int busNo;
     private boolean AC;
    private int capacity;
    Bus(int busNo, boolean ac, int cap) {
        this.busNo =busNo;
        this.AC = ac;
        this.capacity = cap;

    }
    public int getcapacity(){
        return capacity;
    }
     public void  setCapacity(int cap){
        capacity =cap;
     }
     public  void setAC(boolean val){
        AC = val;

     }
     public int getbusNo(){
        return  busNo;

     }
}

