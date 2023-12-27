package HomeWork;

public class T117 {
    //Create a method with the following specs:
    //Returns:
    //an integer
    //Name:`
    //sumEvenToX
    //Parameters:
    //an integer called "x"
    //Purpose:
    //calculate the sum of the EVEN integers from 1 to x (including x)
    //Examples:
    //sumEvenToX(5) ==> 6
    //sumEvenToX(8) ==> 20
    int sumEvenToX(int X){
        int sum=0;
        for (int i = 0; i <=X ; i++) {
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
class T117Tester{
    public static void main(String[] args) {
        T117 t=new T117();
        t.sumEvenToX(8);
    }
}
