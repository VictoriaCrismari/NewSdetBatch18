package class10;

public class CarTester {
    public static void main(String[] args) {
        //Create an object from the class
        Car BMW=new Car();
        BMW.model="17";
        BMW.color="Blue";
        BMW.make="BMW";
        BMW.price=120000;
        BMW.drive();
        BMW.honk();
        BMW.ApplyBreak();
    }
}
