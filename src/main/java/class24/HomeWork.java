package class24;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    //Create a map of Best Buy store. Place
    //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    //Retrieve all keys and values from a Best Buy map using EntrySet.
    public static void main(String[] args) {
        Map<Integer,String> items=new HashMap<>();
        items.put(7664847,"Printer");
        items.put(7879885,"TV");
        items.put(7958897,"Headphones");
        items.put(895467,"Air purifier");
        items.put(769878,"Security camera");
        items.put(568978,"Monitor");
        items.put(698974,"Iphone");
        for(Map.Entry<Integer,String> e:items.entrySet()){
            System.out.println(e);
        }
    }
}
