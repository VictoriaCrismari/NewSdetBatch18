package class9;

public class T5 {
    public static void main(String[] args) {
        int[][] numbers={
                {2,3,4,5},
                {4,5,6,7},
                {9,8,6,12}
        };
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j< numbers[i].length;j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
    }
}
