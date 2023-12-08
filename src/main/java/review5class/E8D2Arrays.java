package review5class;

public class E8D2Arrays {
    public static void main(String[] args) {
        int[][] numbers={
                {10,20,30,40},
                {20,40,60,80},
                {30,60,90,120}
        };
        //getting back complete 1D arrays
        int [] row0=numbers[0];
        //getting individual numbers from @D arrays
        int num=numbers[0][3];
        System.out.println(num);
    }
}
