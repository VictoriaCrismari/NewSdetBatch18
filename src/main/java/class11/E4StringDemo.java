package class11;

public class E4StringDemo {
    public static void main(String[] args) {

        String str = "Now I love Java, Java si great";
        System.out.println(str.startsWith("N"));
        System.out.println(str.startsWith("  "));
        System.out.println(str.startsWith(""));


        System.out.println(str.endsWith("Java"));
        System.out.println(str.endsWith("great"));


        System.out.println(str.contains("Phyton"));
        System.out.println(str.contains("Java"));
    }
}
