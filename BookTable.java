package Cafe_Allocation_System;

import java.util.Scanner;

public class BookTable implements Runnable {
    Scanner sc = new Scanner(System.in);
    String str="";
    int a =0;
    static int tableFor2=8, tableFor4=4, tableFor6=2,tableFor8=2;
    static boolean falgg=true;
    static boolean abc=true;
    public void temp(){
        System.out.println("Please Enter yout name");
        str = sc.nextLine();
    }
    public void run(){
        abc=false;
        System.out.println("Please enter the seat required");
        a = sc.nextInt();
        // Table for 2
        if(a<=2){
            if(tableFor2!=0){
                System.out.println("yout table for "+2+" is booked");
                tableFor2--;
            }else if(tableFor4!=0){
                System.out.println("yout table for "+4+" is booked");
                tableFor4--;
            }else if(tableFor6!=0){
                System.out.println("yout table for "+6+" is booked");
                tableFor6--;
            }else if(tableFor8!=0){
                System.out.println("yout table for "+8+" is booked");
                tableFor8--;
            }else{
                try {
                    falgg=false;
                    throw new NoTableAvailableExeption();
                } catch (NoTableAvailableExeption e) {

                }
            }
        }else if(a<=4){
            if(tableFor4!=0){
                System.out.println("yout table for "+4+" is booked");
                tableFor4--;
            }else if(tableFor6!=0){
                System.out.println("yout table for "+6+" is booked");
                tableFor6--;
            }else if(tableFor8!=0l){
                System.out.println("yout table for "+8+" is booked");
                tableFor8--;
            }else{
                try {
                    falgg=false;
                    throw new NoTableAvailableExeption();
                } catch (NoTableAvailableExeption e) {

                }
            }
        }else if(a<=6){
            if(tableFor6!=0){
                System.out.println("yout table for "+6+" is booked");
                tableFor6--;
            }else if(tableFor8!=0){
                System.out.println("yout table for "+8+" is booked");
                tableFor8--;
            }else{
                try {
                    falgg=false;
                    throw new NoTableAvailableExeption();
                } catch (NoTableAvailableExeption e) {

                }
            }
        }else if(a<=8){
            if(tableFor8!=0){
                System.out.println("yout table for "+8+" is booked");
                tableFor8--;
            }else{
                falgg=false;
                try {
                    throw new NoTableAvailableExeption();
                } catch (NoTableAvailableExeption e) {

                }
            }
        }
    }
}
