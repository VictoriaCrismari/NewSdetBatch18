package class4;

public class Donor {
    public static void main(String[] args) {
        int age=19;
        int weight=100;
        if (age>=18){
            if (weight>=110){
                System.out.println("You can donate");
            }else{
                System.out.println("Gain some weight");
            }
        }else {
            System.out.println("We can't accept you as a donor");
        }
    }
}
