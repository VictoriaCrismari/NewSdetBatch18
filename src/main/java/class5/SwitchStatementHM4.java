package class5;
//if user enters  BMW -->  carOrigin = "german car"
//- if user enters  Toyota -->  carOrigin = " japanese car"
//- if user enters  Maserati -->  carOrigin = "italian car"
//- anything else besides those values --> carOrigin = "unknown"
//
//
//
//```
//The output of your program should be:
//```
//
//```
//"Your favorite car is ___"

import java.util.Scanner;

public class SwitchStatementHM4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String car;
        car= input.nextLine();
        switch (car){
            case "BMW":
                System.out.println("Your favourite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favourite car is japanise car");
                break;
            case "Maserati":
                System.out.println("Your favourite car is italian car");
                break;
            default:
                System.out.println("Your favourite car is unknown");}}}
