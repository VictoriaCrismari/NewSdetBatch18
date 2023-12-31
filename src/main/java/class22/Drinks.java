package class22;

import java.util.ArrayList;

public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Margarita");
        drinks.add("Old Fashioned");
        drinks.add("Bushwacker");
        drinks.add("Cosmopolitan");
        drinks.add("Mimosa");
        for (int i = 0; i < drinks.size(); i++) {
            String s = drinks.get(i);
            if (s.contains("e")||s.contains("a")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
