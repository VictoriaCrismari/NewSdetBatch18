package class14;

public class Task2 {
    int sumArray(int [] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Task2 t=new Task2();
        int[] numbers={10,10,15};
        int sum=t.sumArray(numbers);
        System.out.println(sum);
    }
}
