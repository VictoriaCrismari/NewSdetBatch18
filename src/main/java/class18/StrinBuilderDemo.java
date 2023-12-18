package class18;

public class StrinBuilderDemo {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.concat(" And Welcome"));

        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" And Welcome");
        System.out.println(sb);

    }
}
