package HomeWork;

import java.util.Scanner;

public class T101StringManipulation {
    //Inputs:
    //String word;
    //Write a for loop that will print out every other letter in a String, starting with the first letter.  These letters should be printed all on one line with no space in between.
    //Sample input/outputs`
    //In: hello
    //hlo
    //In: SSyynnttaaxxTTeecchhnnoollooggiieess
    //SyntaxTechnologies
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= input.next();
        for (int i=0;i<word.length();i+=2){
            System.out.print(word.charAt(i));
        }
    }
}
