package Cafe_Allocation_System;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class InValidOrderException extends Exception{
    InValidOrderException(){
        System.out.println("--------IN VALID ORDER EXCEPTION--------");
        System.out.println("--------Order At Least One Coffee--------");
    }
}
