package class4;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        System.out.println("What is the amount of loan needed?");
        Scanner sc=new Scanner(System.in);
        double loan= sc.nextDouble();
        if (loan<=200000){
            System.out.println("We will lend you money");
        }else {
            System.out.println("We can't lend money");
        }
    }
}
