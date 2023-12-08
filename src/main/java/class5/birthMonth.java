package class5;

import java.util.Scanner;

public class birthMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your month of birth?");
        String month= sc.next();
        if (month.equalsIgnoreCase("December")
                ||month.equalsIgnoreCase("January")||
                month.equalsIgnoreCase("February")){
            System.out.println("Winter");
        } else if (month.equalsIgnoreCase("September")||
                month.equalsIgnoreCase("Octomber")||
                month.equalsIgnoreCase("November")) {
            System.out.println("Autumn");
        } else if (month.equalsIgnoreCase("June")||
                month.equalsIgnoreCase("July")||
                month.equalsIgnoreCase("August")) {
            System.out.println("Summer");
        } else if (month.equalsIgnoreCase("March")||
                month.equalsIgnoreCase("April")||
                month.equalsIgnoreCase("May")) {
            System.out.println("Spring");

        }
    }
}
