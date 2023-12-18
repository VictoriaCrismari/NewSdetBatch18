package class18;

public class Car {
    //1)Create a class Car with properties like make, model, and year.
    //Implement a method calculate_rental_price based on the number of rental days.
    //Create two subclasses: LuxuryCar and EconomyCar. Override the
    // calculate_rental_price method in LuxuryCar to include additional charges.
    //Demonstrate the functionality by creating instances of each class and calling their methods
    private String make, model;
    private int year;
    public static void rentalPrice(int rentalDays){
        double price=rentalDays*57.99;
        System.out.println("Price for the chosen car for "+rentalDays+" days is "+price);
    }
    public Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
}
class LuxuryCar extends Car{
    public LuxuryCar(String make,String model,int year){
        super(make,model,year);
    }
    public static void rentalPrice(int rentalDays){
        double price=rentalDays*129.59;
        System.out.println("Price for a luxury car for "+rentalDays+" days is "+price);
    }

}
class EconomyCar extends Car{
    public EconomyCar(String make,String model,int year){
        super(make,model,year);
    }

}

class CarTester{
    public static void main(String[] args) {
        LuxuryCar c1=new LuxuryCar("BMW","X6",2023);
        c1.rentalPrice(5);
        EconomyCar c2=new EconomyCar("Ford","Focus",2023);
        c2.rentalPrice(7);
    }
}