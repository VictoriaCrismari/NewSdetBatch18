package review5class;

import java.util.Arrays;
import java.util.Scanner;

public class E10ScannerArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please Enter the number"+(i+1));
            numbers[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
