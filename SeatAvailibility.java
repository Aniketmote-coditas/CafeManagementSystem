package Cafe_Allocation_System;

public class SeatAvailibility extends BookTable implements Runnable {
    @Override
    public void run() {
        System.out.println("----------SEAT AVAILIBILITY-----------");
        System.out.println("Table for 2 available - "+tableFor2);
        System.out.println("Table for 4 available - "+tableFor4);
        System.out.println("Table for 6 available - "+tableFor6);
        System.out.println("Table for 8 available - "+tableFor8);
        System.out.println("------------------------------------------");
    }
}
