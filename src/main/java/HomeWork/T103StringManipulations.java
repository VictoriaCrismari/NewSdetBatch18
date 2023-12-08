package HomeWork;

import java.util.Scanner;

public class T103StringManipulations {
    //Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
    //
    //Sample input/outputs:
    //
    //```
    //In: hello
    //h e l l o
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= input.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            System.out.print(word.charAt(i)+" ");

        }
    }
}
