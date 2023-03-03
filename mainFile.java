package Cafe_Allocation_System;

import java.util.Scanner;

public class mainFile {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);


        System.out.println("------------WELCOME TO CAFE ALLOCATION SYSTEM----------------");
        System.out.println("--MENU--");
        System.out.println("PRESS 0 FOR EXIT\nPRESS 1 FOR BOOK TABLE\nPRESS 2 FOR PRINT MENU\nPRESS 3 FOR ORDER Food");
        boolean falggg=true;
        while (falggg) {
            BookTable bookTable = new BookTable();
            Thread t = new Thread(bookTable);

            PrintMenu printMenu = new PrintMenu();
            Thread t1 = new Thread(printMenu);

            PlaceOrder placeOrder = new PlaceOrder();
            Thread t2 = new Thread(placeOrder);

            int choiceOfUser= sc.nextInt();

            switch (choiceOfUser) {
                case 0:
                    falggg=false;
                    break;
                case 1:
                    bookTable.temp();
                    t.start();
                    t.join();
                    System.out.println("PRESS 0 FOR EXIT\nPRESS 1 FOR BOOK TABLE\nPRESS 2 FOR PRINT MENU\nPRESS 3 FOR ORDER FOOD");
                    break;
                case 2:
                    t1.start();
                    t1.join();
                    System.out.println("PRESS 0 FOR EXIT\nPRESS 1 FOR BOOK TABLE\nPRESS 2 FOR PRINT MENU\nPRESS 3 FOR ORDER FOOD");
                    break;
                case 3:
                    t2.start();
                    t2.join();
                    System.out.println("PRESS 0 FOR EXIT\nPRESS 1 FOR BOOK TABLE\nPRESS 2 FOR PRINT MENU\nPRESS 3 FOR ORDER FOOD");
                    break;
                default:
                    System.out.println("PLEASE SELECT FROM ABOVE OPTIONS");
                    break;
            }
        }
    }
}
/*
------------WELCOME TO CAFE ALLOCATION SYSTEM----------------
--MENU--
PRESS 0 FOR EXIT
PRESS 1 FOR BOOK TABLE
PRESS 2 FOR PRINT MENU
PRESS 3 FOR ORDER Food
1
Please Enter yout name
Aniket Mote
Please enter the seat required
7
yout table for 8 is booked
PRESS 0 FOR EXIT
PRESS 1 FOR BOOK TABLE
PRESS 2 FOR PRINT MENU
PRESS 3 FOR ORDER FOOD
2
SR      ||     Food     ||     Price
0           sandwich       90 RS
1           coffee         100 RS
2           pizza          200 RS
PRESS 0 FOR EXIT
PRESS 1 FOR BOOK TABLE
PRESS 2 FOR PRINT MENU
PRESS 3 FOR ORDER FOOD
3
SR      ||     Food     ||     Price
0           sandwich       90 RS
1           coffee         100 RS
2           pizza          200 RS
3           Exist
press 100 for exist
please Enter your table no
34
Please enter the  SR  of order
0
Please enter the Quantity
5
Please enter the  SR  of order
1
Please enter the Quantity
8
Please enter the  SR  of order
2
Please enter the Quantity
9
Please enter the  SR  of order
3
+--------+--------+
|  Items | total |
+--------+--------+
|Sandwich|     450|
|  Coffee|     720|
|   Pizza|     810|
---------------------------------------------
Bill No 63 Total bill of order is = 3050
---------------------------------------------
PRESS 0 FOR EXIT
PRESS 1 FOR BOOK TABLE
PRESS 2 FOR PRINT MENU
PRESS 3 FOR ORDER FOOD
1
Please Enter yout name
akash
Please enter the seat required
7
yout table for 8 is booked
PRESS 0 FOR EXIT
PRESS 1 FOR BOOK TABLE
PRESS 2 FOR PRINT MENU
PRESS 3 FOR ORDER FOOD
1
Please Enter yout name
yash
Please enter the seat required
7
---------------No table available in cafe------------------
---------------Please Wait for Some Time------------------
PRESS 0 FOR EXIT
PRESS 1 FOR BOOK TABLE
PRESS 2 FOR PRINT MENU
PRESS 3 FOR ORDER FOOD
3
----------------No Reseervation Found---------------------
----------------Please Book The Table First---------------------
PRESS 0 FOR EXIT
PRESS 1 FOR BOOK TABLE
PRESS 2 FOR PRINT MENU
PRESS 3 FOR ORDER FOOD
0

Process finished with exit code 0
 */