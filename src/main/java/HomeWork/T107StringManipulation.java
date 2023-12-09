package HomeWork;

public class T107StringManipulation {
    //Given String = "Hello Friends"
    //**Expected Output:*
    //sdneirF olleH
    public static void main(String[] args) {
        String str= "Hello Friends";
        String reverseString="";
        for (int i = str.length()-1; i >=0 ; i--) {
           reverseString=reverseString+str.charAt(i);

        }System.out.println(reverseString);
    }
}
