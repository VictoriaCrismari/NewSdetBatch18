package class22;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Victoria");
        names.add("Maria");
        names.add("Karimi");
        names.add("Asghar");
        names.add("Linda");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Victoria"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
