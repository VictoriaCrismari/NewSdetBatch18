package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="It's Savera's birthday today. Its Sunday. It's java class";
        String[] wordArr= str.split(" ");
        System.out.println(wordArr.length);
        System.out.println(wordArr[0]);
    }
}
