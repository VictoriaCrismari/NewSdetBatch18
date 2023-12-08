package HomeWork;

public class T53DoWhileLoop {
    //Using do while loop print even numbers from 20 to 1
    public static void main(String[] args) {
        int i=20;
        do {
            if (i%2==0) {
                System.out.println(i);
            }i-=2;
        }while(i>=1);
}}
