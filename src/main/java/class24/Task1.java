package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String> buildings=new LinkedHashMap<>();
        buildings.put(1,"Google");
        buildings.put(2,"Syntax");
        buildings.put(3,"White House");
        buildings.put(3,"LG");
        buildings.put(7,"LG");
        buildings.put(4,"City hall");
        buildings.put(5,"Museum");
        buildings.put(6,"Theatre");
        buildings.put(2,"Syntax");
        System.out.println(buildings.size());
        System.out.println(buildings);
        buildings.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("**************");
        buildings.forEach((k,v)->{
            if (v.contains("a")&&k<10){
                System.out.println(k+" "+v);
            }
        });
    }
}
