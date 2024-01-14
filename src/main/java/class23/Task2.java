package class23;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Set<String> countries=new TreeSet<>();
        countries.add("Romania");
        countries.add("USA");
        countries.add("Moldova");
        countries.add("Ukraine");
        countries.add("Poland");
        System.out.println(countries);
        for (String country:countries) {
            System.out.println(country);
        }
    }
}
