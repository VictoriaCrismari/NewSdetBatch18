package class17;

public class MinOfTwo {
    public void Comp(int num1,int num2){
        if(num1>num2){
            System.out.println(num1);
        }else System.out.println(num2);
    }
    public void Comp(double num1,double num2){
        if(num1>num2){
            System.out.println(num1);
        }else System.out.println(num2);
    }
    public void Comp(int num1,double num2){
        if(num1>num2){
            System.out.println(num1);
        }else System.out.println(num2);
    }
    public void Comp(double num1,int num2){
        if(num1>num2){
            System.out.println(num1);
        }else System.out.println(num2);
    }
}
class MinOfTwoTester{
    public static void main(String[] args) {
        MinOfTwo N=new MinOfTwo();
        N.Comp(5,7);
        N.Comp(8.9,4.6);
        N.Comp(8.2,6);
        N.Comp(5,6.3);

    }
}
