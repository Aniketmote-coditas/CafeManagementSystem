package Cafe_Allocation_System;

public class NoTableAvailableExeption extends Exception{
    NoTableAvailableExeption(){
        System.out.println("---------------No table available in cafe------------------");
        System.out.println("---------------Please Wait for Some Time------------------");
    }

}
