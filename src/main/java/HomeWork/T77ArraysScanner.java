package HomeWork;

import java.util.Scanner;

public class T77ArraysScanner {
    //Create an array of integers that will store 5 elements taken from a user
    //
    //Don't print any prompt message for the user
    //
    //Then print out all the elements you have created in the first loop in reverse order.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                int[] i=new int[5];
        for (int j=0;j<5;j++) {
            i[j] = input.nextInt();
        }
        for (int j = i.length-1; j>=0; j--){
            System.out.println(i[j]);}

    }
}
