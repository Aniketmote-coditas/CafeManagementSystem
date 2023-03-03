package Cafe_Allocation_System;
import java.util.*;

public class PlaceOrder extends BookTable implements Runnable{
    Scanner sc = new Scanner(System.in);
    int [] price = {90,100,200};
    String [] food = {"Sandwich","Coffee","Pizza"};
    HashMap<Integer,Integer> map = new HashMap<>();
    HashMap<String,Integer> sortMap(HashMap<String,Integer> hashMap){
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    HashMap<String,Integer> map1 = new HashMap<>();

    public void run() {
        if(super.abc==false) {
            if (super.falgg) {
                System.out.println("SR      ||     Food     ||     Price\n0           sandwich       90 RS\n1           coffee         100 RS\n2           pizza          200 RS\n3           Exist");
                System.out.println("press 100 for exist");
                System.out.println("please Enter your table no");
                int tableNumber = sc.nextInt();
                boolean temp = true;
                int totalPriceOfOrder = 0;
                while (temp) {
                    System.out.println("Please enter the  SR  of order");
                    int serialNumber = sc.nextInt();
                    if (serialNumber == 3) {
                        break;
                    } else if (serialNumber != 0 && serialNumber != 1 && serialNumber != 2) {
                        System.out.println("Invalid choice entered. Please select from above menu");
                    } else {
                        System.out.println("Please enter the Quantity");
                        int quantity = sc.nextInt();
                        map.put(serialNumber, quantity);
                        map1.put(food[serialNumber],price[a] * quantity);
                    }
                }
                int count = 0;
                for (Integer key : map.keySet()) {
                    // ...
                    if (key == 1) {
                        count = 10;
                    }
                }
                if (count == 0) {
                    try {
                        throw new InValidOrderException();
                    } catch (InValidOrderException e) {

                    }
                } else {
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        int a = entry.getKey();

                        totalPriceOfOrder += price[a] * entry.getValue();
                    }
                    Random random = new Random();
                    int randomNumber = random.nextInt(100) + 1;

                    HashMap<String,Integer> map2=sortMap(map1);
                    System.out.println("+--------+--------+");
                    System.out.println("|  Items | total |");
                    System.out.println("+--------+--------+");
                    for (Map.Entry<String, Integer> entry : map2.entrySet()) {

                        //System.out.println(entry.getKey()+" "+entry.getValue());
                        String result=String.format("|%8s", entry.getKey())+"|    "+String.format("%4s",entry.getValue())+"|    ";
                        System.out.println(result);
                    }
                    System.out.println("---------------------------------------------");
                    System.out.println("Bill No " + randomNumber + " Total bill of order is = " + totalPriceOfOrder);
                    System.out.println("---------------------------------------------");
                }


            } else try {
                throw new NoReservationFoundException();
            } catch (NoReservationFoundException e) {

            }
        }else try {
            throw new NoReservationFoundException();
        } catch (NoReservationFoundException e) {

        }

    }

}
