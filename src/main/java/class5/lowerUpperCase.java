package class5;

import java.util.Scanner;

public class lowerUpperCase {
    public static void main(String[] args) {
        Scanner pot=new Scanner(System.in);
        System.out.println("Enter a country: ");
        String place=pot.nextLine();

        switch (place){
            case "Spain":
                System.out.println("Spanish");
                break;
            case "Ethiopia":
                System.out.println("Amharic");
                break;
            case "Egypt":
                System.out.println("Arabic");
                break;
            case "Brazil":
                System.out.println("Protuguese");
                break;
            case "Japan":
                System.out.println("Japanese");
            default:
                System.out.println("No knowledge");
        }
    }
    }

