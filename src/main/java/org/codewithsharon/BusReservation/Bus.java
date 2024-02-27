package org.codewithsharon.BusReservation;
public class Bus {
    private int busNo;
    private boolean AC;
    private int capacity;
    Bus(int busNo, boolean ac, int cap) {
        this.busNo = busNo;
        this.AC = ac;
        this.capacity = cap;

    }
    public int getCapacity() {
        return capacity;
    }// accessor
    public void setCapacity(int cap) {
        capacity = cap;
    }// mutator

    public void setAC(boolean val) {
        AC = val;
    }
    public boolean isAC() {// above parameter is used
        return AC;
    }
    public int getbusNo() { // above parameter is used
        return busNo;
    }
    public void displayInfo(){
        System.out.println("BusNo: " +busNo +" AC: " + AC + " Total Capacity: "+ capacity);
    }
}

