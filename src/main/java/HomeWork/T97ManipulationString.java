package HomeWork;

import java.util.Scanner;

public class T97ManipulationString {
    //Based on the user inputs program should give a correct answer.
    //If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
    //"Proceed with Chrome browser"
    //If browser is firefox, FIREFOX or FireFOX it should print the:
    //"Proceed with Firefox browser"
    //If browser is IE, ie or iE it should print the:
    //"Proceed with IE browser"
    //If any other browser it should print the:
    //"Invalid browser"
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String inputString= input.next();
        if (inputString.equalsIgnoreCase("chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (inputString.equalsIgnoreCase("firefox")) {
            System.out.println("Proceed with Firefox browser");
        } else if (inputString.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");

        }
}}
