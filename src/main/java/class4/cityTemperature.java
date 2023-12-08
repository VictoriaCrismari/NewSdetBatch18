package class4;

import java.util.Scanner;

public class cityTemperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What city you live in?");
        String city= sc.nextLine();
        System.out.println("What is the temperature in your city in F?");
        double temp= sc.nextDouble();
        double tempInF=(temp-32.0)/1.8;
        System.out.println("Temperature in your city is "+tempInF+" C");
    }
}
