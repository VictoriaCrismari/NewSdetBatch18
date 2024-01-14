package review10;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Victoria";
        String reversedName=new StringBuilder(name).reverse().toString();
        System.out.println(reversedName);
    }
}
class AddNumbersArray{
    double arraySum (double a,double b,double c,double d, double e){
        double sum=a+b+c+d+e;
        System.out.println(sum);
        return sum;
    }

}
class AddNumberTester{
    public static void main(String[] args) {
        AddNumbersArray a=new AddNumbersArray();
        a.arraySum(5,7,8,9,4);
    }
}
