package class4;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if (age>=18){
            System.out.println("We will issue you a driver license");
        }else{
            System.out.println("We can't issue a driver license");
        }
    }
}
