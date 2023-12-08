package class8;

public class E1Arrays {
    public static void main(String[] args) {
        int [] numbers={10,25,55,45,89,45,69};
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]==89){
                System.out.println(" Number 89 is present");
                break;
            }
        }
    }
}
