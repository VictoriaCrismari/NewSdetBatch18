package HomeWork;

public class T71Arrays {
    //Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
    //
    //Print only values that stored with even index including 0.
    //
    //**Output:**
    //
    //```
    //45 12 55 23 88

    public static void main(String[] args) {
        int[] numbers={45,78,12,67,55,89,23,77,88};
        for( int index = 0; index < numbers.length; index += 2) {
            System.out.print(numbers[index]+" ");
        }
        }
    }
