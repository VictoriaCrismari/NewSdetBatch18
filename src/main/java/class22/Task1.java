package class22;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> words=new ArrayList<>();
        words.add("Victoria");
        words.add("Daniel");
        words.add("Lara");
        words.add("Andrew");
        for (int i = 0; i < words.size() ; i++) {
            if (words.get(i).endsWith("e")){
                words.remove(i);
                i--;
        }
        } System.out.println(words);
        words.forEach(x-> System.out.println(x));
    }
}
