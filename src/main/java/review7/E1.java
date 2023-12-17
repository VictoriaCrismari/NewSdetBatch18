package review7;

public class E1 {
    /*Create a method which will take an array of ints
     as input and goind to return the sum of all numbers
     from the input array */
    public static int arr(int [] number){
        int sum=0;
        for (int i=0; i<number.length;i++){
            sum=sum+number[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arr(new int[]{10,20,35,45}));
    }
}
