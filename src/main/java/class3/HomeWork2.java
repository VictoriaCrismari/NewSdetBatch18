package class3;

public class HomeWork2 {
    public static void main(String[] args) {
        double mortgageRate=4.2;
        int mortgagePrice=120000;
        if (mortgageRate<=4.5){
            System.out.println("Will consider buying");
            if (mortgagePrice<=100000){
                System.out.println("Will pay cash");
            }else{
                System.out.println("Will take a loan");
            }
        }else{
            System.out.println("Will not buy the house");
        }
    }

}
