package HomeWork;

import java.util.Scanner;

public class T64ForLoop {
    //Write a for loop that will print out a series of numbers starting
    // at 0 and ending at the doubled value of end(value must be taken
    // from a user), exclusive.
    //Each number should be on the same line, separated by a space.
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    int end= input.nextInt();
        for( double i=0;i<=(end*2);i++){
            System.out.print(i+" ");

    }
}}
