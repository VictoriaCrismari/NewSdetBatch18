package HomeWork;

public class T82D2Arrays {
    public static void main(String[] args) {
        //Write a program that will print the sum of all elements in 2D array.
        int[][] num={
                {4,7,2,5},
                {-20,2,-9}
        };
        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                sum=sum+num[i][j];
            }
            System.out.println(sum);
        }
    }
}
