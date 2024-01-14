package class23;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<String> city = new LinkedHashSet<>();
        city.add("Salt Lake City");
        city.add("Austin");
        city.add("Las Vegas");
        city.add("Mobile");
        city.add("Auburn");
        System.out.println(city);
        city.removeIf(x -> x.startsWith("A"));
        System.out.println(city);
    }
}
