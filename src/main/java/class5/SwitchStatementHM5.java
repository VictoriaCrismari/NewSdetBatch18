package class5;

import java.util.Scanner;

//Ask the user to enter any number from 1-7.
//
//Based on the number define the day of the week
//
//**Example Output:**
//
//```
//Input a number between 1-7
//```
//
//```
//Friday
//```
//
//**Example Output:**
//
//```
//Input a number between 1-7
//```
//
//```
//Invalid
//```
public class SwitchStatementHM5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input a number between 1-7");
        int num;
        num= input.nextInt();

        switch (num){
        case 1:
        System.out.println("Monday");
        break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
    }
}}
