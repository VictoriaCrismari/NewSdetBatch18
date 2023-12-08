package class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="It's Savera's birthday today. Its Sunday. It's java class";
        String[] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[1].trim());
    }
}
