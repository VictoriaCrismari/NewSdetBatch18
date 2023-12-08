package HomeWork;

import java.util.Scanner;

public class T102StringManipulation {
    //Inputs:
    //
    //```
    //String word;
    //```
    //
    //Write a for loop that will loop through every character of a word and print out each character, each on a separate line
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= input.nextLine();
        for (int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
    }
}
