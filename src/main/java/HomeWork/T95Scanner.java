package HomeWork;

import java.util.Scanner;

public class T95Scanner {
    //Using Scanner class input string value.
    //Print out the following: "The first 3 letters of \_\_\_ is ___"
    //For example, if the input is "banana", your output should be:
    // "The first 3 letters of banana is ban".
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String inputString= input.nextLine();
        System.out.println("The first 3 letters of "+inputString+" is "+inputString.substring(0,3));

    }
}
