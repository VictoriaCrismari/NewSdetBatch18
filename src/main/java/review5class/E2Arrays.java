package review5class;

public class E2Arrays {
    public static void main(String[] args) {
        //creating and initializating it
        int[] numbers = {10, 25, 36, 56, 80};
        System.out.println(numbers.length);
        System.out.println(numbers[1]);
        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
        for (int n : numbers) {
            System.out.println(n + " ");
        }

    }
}