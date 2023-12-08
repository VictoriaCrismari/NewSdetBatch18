package HomeWork;

import java.util.Scanner;

public class T78ArraysScanner {
    //Create an int array of integers with a size
    // of 5 and input values with Scanner.
    //Don't print prompt questions for a user.
    //Using loop print out each element of the array
    // that should look like the output below
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array=new int[5];
        for (int i=0;i< array.length;i++){
            array[i]=input.nextInt();
        }for (int i=0;i<array.length;i++){
            System.out.println(array[i]+"0");
        }
    }
}
