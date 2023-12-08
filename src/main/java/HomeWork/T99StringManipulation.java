package HomeWork;

import java.util.Scanner;

public class T99StringManipulation {
    //Write code that will take in a String input and check to see if it is a palindrome or not.
    //A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
    //Examples of palindromes:
    //- racecar
    //- was it a car or a cat I saw
    //- never odd or even
    //- rats live on no evil star
    //Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
    //Your program will print out "true" if it's a palindrome and "false" if not.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String inputString= input.nextLine();
        String reverseInput="";
        boolean palindrome=true;
        for (int i=inputString.length()-1;i>=0;i--){
            reverseInput=reverseInput+inputString.charAt(i);}
        if (inputString.equalsIgnoreCase(reverseInput)){
            System.out.println(palindrome);
        }else{
            System.out.println(!palindrome);
        }
    }
}
