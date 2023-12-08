package class8;

public class T4 {
    public static void main(String[] args) {
        int[] num={10,15,20,18,9,60,22,300};
        int sumEven=0, sumOdd=0;
        for (int x:num){
            if (x%2==0){
                sumEven++;
            }if (x%2!=0){
                sumOdd++;
            }
        } System.out.println(sumEven+" numbers are even");
        System.out.println(sumOdd+" numbers are odd");
    }
}
