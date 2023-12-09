package review6class;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Today is java review class";
        System.out.println(str.charAt(3));
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
