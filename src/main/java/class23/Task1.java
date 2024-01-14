package class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        Set <String> newList=new LinkedHashSet<>(aList);
        System.out.println(newList);
        aList.clear();
        aList.addAll(newList);
        System.out.println(aList);
    }
}
