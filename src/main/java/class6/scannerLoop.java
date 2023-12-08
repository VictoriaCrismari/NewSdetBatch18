package class6;

import java.util.Scanner;

public class scannerLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start= input.nextInt();
        System.out.println("Please enter the end");
        int end= input.nextInt();
        System.out.println("Please enter the step size as well");
        int step= input.nextInt();
        while (start<=end){
            System.out.println(start+" ");
            start=start+step;
        }
    }
}
