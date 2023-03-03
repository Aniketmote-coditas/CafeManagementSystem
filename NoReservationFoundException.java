package Cafe_Allocation_System;

public class NoReservationFoundException extends Exception{
    NoReservationFoundException(){
        System.out.println("----------------No Reseervation Found---------------------");
        System.out.println("----------------Please Book The Table First---------------------");
    }
}
