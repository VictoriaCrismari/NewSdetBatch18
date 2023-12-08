package class5;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What time is it now?");
        double hour= sc.nextDouble();
        if (hour>=1&&hour<=11){
            System.out.println("Morning");
        } else if (hour>=12&&hour<=15) {
            System.out.println("Afternoon");
        } else if (hour>=16&&hour<=20) {
            System.out.println("Evening");
        } else if (hour>=21&&hour<=24) {
            System.out.println("Night");
        }else {
            System.out.println("Invalid");
        }
    }
}
