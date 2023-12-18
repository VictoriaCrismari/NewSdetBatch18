package class18;

public class CreditCard {
    void calcInterest(double balance){
        double interest=balance*0.05;
        System.out.println("Interest on "+balance+" is "+interest);
    }
}
class Visa extends CreditCard{
    void calcInterest(double balance){
        double interest=balance*0.07;
        System.out.println("Interest on "+balance+" is "+interest);
    }
}
class AX extends CreditCard{
    void calcInterest(double balance){
        double interest=balance*0.09;
        System.out.println("Interest on "+balance+" is "+interest);
    }
        }
        class CreditCardTester{
            public static void main(String[] args) {
                AX ax=new AX();
                ax.calcInterest(100);
                Visa v=new Visa();
                v.calcInterest(100);
            }
        }
