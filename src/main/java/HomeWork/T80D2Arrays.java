package HomeWork;

public class T80D2Arrays {
    public static void main(String[] args) {
    double [][] numbers={
            {2.8,4.0,6.6,4.0},
            {8.0,3.0,12.2,2.0},
            {2.4,6.2,8.0,3.2}
    };
        for (int i = 0; i <numbers.length ; i++) {
        for (int j = 0; j < numbers[i].length ; j++) {
            System.out.print(numbers[i][j]*2+" ");

        }
        System.out.println("");

    }
}
}
