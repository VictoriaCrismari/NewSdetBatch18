package HomeWork;

import java.util.Scanner;

public class T100StringManipulation {
    //Given the following inputs:
    //String s;
    //Write a for loop that will print out the reverse of the string.
    //Sample input/outputs:
    //In: manhattan
    //nattahnam
    //In: processor
    //rossecorp
    //In: racecar
    //racecar
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String inputS= input.nextLine();
        String reverseInput="";
        for (int i=inputS.length()-1;i>=0;i--){
            reverseInput=reverseInput+inputS.charAt(i);
        }
        System.out.println(reverseInput);
    }
}
