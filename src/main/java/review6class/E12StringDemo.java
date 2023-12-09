package review6class;

public class E12StringDemo {
    public static void main(String[] args) {
        String str="My names is James my number is 9291846";
        String number=str.replaceAll("[^0-9]","");
        System.out.println(number);
        StringBuilder stringBuilder=new StringBuilder("Java");
        System.out.println(stringBuilder);
    }
}
