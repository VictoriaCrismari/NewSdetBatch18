package class22;

import java.util.ArrayList;

public class ArrayListTask2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Victoria");
        names.add("Maria");
        names.add("Karimi");
        names.add("Asghar");
        names.add("Linda");
        for(String s:names){
            if (s.contains("o")){
                System.out.println("Yes");
            }else System.out.println("No");
        }
        for (int i = 0; i < names.size(); i++) {
            String s=names.get(i);
            if (s.contains("o")) {
                names.set(i,"Java");
            }

        } System.out.println(names);
        }
}
