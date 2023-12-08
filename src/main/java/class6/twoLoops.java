package class6;

public class twoLoops {
    public static void main(String[] args) {
        for(int i=20;i<=50;i++){
            if (i%2==1){
                System.out.print(i+" ");
            };
            while (i<=50){
                System.out.print(i+" ");
                i=i+2;
            }
        }
    }
}
