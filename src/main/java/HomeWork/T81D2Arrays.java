package HomeWork;

public class T81D2Arrays {
    public static void main(String[] args) {
        int[] num={2,8,5};
        int max = num[0];
        for (int i = 0; i < num.length ; i++) {
            if (num[i]>max)
                max=num[i];
        }
        System.out.println(max);
    }
}
