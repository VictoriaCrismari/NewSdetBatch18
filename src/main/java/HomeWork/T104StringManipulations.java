package HomeWork;

import java.util.Scanner;

public class T104StringManipulations {
    //Create an array of names that will hold 5 String elements.
    //Names must be taking from a user.
    //Print out the first three characters of each element of the array, one per line.
    //Note: every array element must be at least 3 characters long.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] names=new String[5];
        for (int i = 0; i <5 ; i++) {
            names[i]= input.nextLine();
        String array=names[i];
                String FirstThree=array.substring(0,3);
            System.out.println(FirstThree);
            }
            }

        }
