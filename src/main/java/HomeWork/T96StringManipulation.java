package HomeWork;

import java.util.Scanner;

public class T96StringManipulation {
    //You have Scanner class to input string value.
    //If language is Java it should print the:
    //"Java is a programming language".
    //If language is C it should print the:
    //"C is a procedural programming language"
    //If language is C++ it should print the:
    //"C++ is a middle-level programming language"
    //If any other should print:
    //"Doesn't match any programming language"
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String inputString= input.next();
        if (inputString.equalsIgnoreCase("java")){
            System.out.println("Java is a programming language");
        } else if (inputString.equalsIgnoreCase("c")) {
            System.out.println("C is a procedural programming language");
        } else if (inputString.equalsIgnoreCase("C++")) {
            System.out.println("C++ is a middle-level programming language");
        } else {
            System.out.println("Doesn't match any programming language");

        }

    }
}
