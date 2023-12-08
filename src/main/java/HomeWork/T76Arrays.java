package HomeWork;

import java.util.Scanner;

public class T76Arrays {
    //Write a program that creates a String array with size 7.
    //
    //Ask the user to input Days of a week beginning with Sunday using Scanner class.
    //
    //Add these inputs to your array and then print all values from that array
    //
    //Example:
    //
    //Please enter day 1 of the week
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int j=7;
            String[] names = new String[j];
            for (int i = 0; i < 7; i++) {
                names[i] = input.next();}
            for (int i=0;i<7;i++)
                System.out.println(names[i]);
            }
        }

