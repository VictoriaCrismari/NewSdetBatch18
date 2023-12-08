package class4;

public class LargestNumber {
    public static void main(String[] args) {
        int num1=25;
        int num2=34;
        int num3=45;
        if (num1>num2){
            if (num1>num3){
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else if (num1>num3) {
            if (num1>num2){
                System.out.println(num1);
            }else{
                System.out.println(num2);
            }
        } else if (num2>num3){
            if (num2>num1){
                System.out.println(num2);
            }else {
                System.out.println(num1);
            }}else if (num3>num1){
                System.out.println(num3);
            }else {
                System.out.println(num1);
            }
        }
    }
