package class4;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        System.out.println("Do you have a credit card?");
        Scanner sc = new Scanner(System.in);
        String hasCreditC= sc.nextLine();
        if (hasCreditC.equals("No")){
            System.out.println("Would you like one?");}
        else if(hasCreditC.equals("Yes")){
            System.out.println("What is the balance?");
        }
        double balance = sc.nextDouble();
        if (balance>=1000){
            System.out.println("You have to pay off your balance ASAP");
        }else{
            System.out.println("You can spend more");
        }}

        }




