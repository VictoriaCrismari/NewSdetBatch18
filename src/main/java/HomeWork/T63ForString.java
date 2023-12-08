package HomeWork;

import java.util.Scanner;

public class T63ForString {
    //Write a for loop that will print out a series of numbers starting at 0
    // and ending at the x(value must be taken from a user), exclusive.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int xValue= input.nextInt();
        for (int i=0;i<xValue;i++){
            System.out.println(i);
        }
    }
}
