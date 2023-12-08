package class5;

import java.util.Scanner;

public class WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What number of the day it is?");
        int day= sc.nextInt();
        if (day<=5&&day>=0){
            System.out.println("It is a weekday");
        } else if (day>5&&day<=7) {
            System.out.println("It is weekend");
        }else {
            System.out.println("Invalid day");
        }
    }
}
