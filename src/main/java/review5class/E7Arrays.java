package review5class;

public class E7Arrays {
    public static void main(String[] args) {
        int[] numbers={10,25,36,56,80};
        for (int i= 0;  i<numbers.length ; i++) {
            System.out.println(numbers);
        }
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
