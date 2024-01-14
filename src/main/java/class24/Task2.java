package class24;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("Moldova","Chisinau");
        countries.put("Romania","Bucuresti");
        countries.put("USA","Washington DC");
        countries.put("Russia","Moscow");
        countries.put("Ireland","Dublin");
        countries.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("****");
        countries.forEach((k,v)-> System.out.println(v));
    }
}
