package class17;

public class ClassWStaticMethod {
    static void method(int num1, int num2){
        System.out.println("Method 1");
    }
    static void method(char c1, char c2){
        System.out.println("Method 2");
    }
    static void method(double d1, double d2){
        System.out.println("Method 3");
    }
}
class ClassWStaticMethodTester{
    public static void main(String[] args) {
        ClassWStaticMethod Class1=new ClassWStaticMethod();
        Class1.method(5,8);
        ClassWStaticMethod Class2=new ClassWStaticMethod();
        Class2.method('B','C');
        ClassWStaticMethod Class3=new ClassWStaticMethod();
        Class3.method(5.2,6.3);
        };
    }

