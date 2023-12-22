package class19;

public class Vehicle {
    /*1) Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
    Define common attributes like speed, color, and fuelType in the Vehicle class.
    Override methods in the subclasses, like accelerate and brake, with specific behaviors.
    Add unique methods in subclasses, like loadCargo in Truck.
    Instantiate objects of each subclass and store them in an array. Iterate through the array to demonstrate polymorphism.*/

    private int speed;
    private String color;
    private String fuelType;
    public Vehicle(String color,int speed, String fuelType){
        this.color=color;
        this.speed=speed;
        this.fuelType=fuelType;
    }
    void printInfo(){
        System.out.println(color+" "+speed+" "+fuelType);
    }
    void accelerate(){
        System.out.println("Vehicle accelerates");
    }
    void brake(){
        System.out.println("Vehicle is stopping");
    }

}
class Car extends Vehicle {
    public Car(String color, String fuelType, int speed) {
        super(color, speed, fuelType);
    }

    void brake() {
        System.out.println("Car is stopping");
    }
    void drivesOnHighway(){
        System.out.println("Car drives on highway");
    }
    void accelerate() {
        System.out.println("Car accelerates");
    }
}
class Truck extends Vehicle{
    public Truck(String color,String fuelType,int speed){
        super(color, speed, fuelType);
    }
    void loadCargo(){
        System.out.println("Truck is being loaded");
    }
    void brake(){
        System.out.println("Truck is stopping");
    }
    void accelerate(){
        System.out.println("Truck accelerates");
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(String color,String fuelType,int speed){
        super(color,speed,fuelType);
    }
    void brake(){
        System.out.println("Motorcycle is stopping");
    }
    void accelerate(){
        System.out.println("Motorcycle accelerates");
    }
    void onePassenger(){
        System.out.println("Motorcycle takes only one passenger");
    }
}
class Bicycle extends Vehicle{
    public Bicycle(String color,String fuelType,int speed){
        super(color,speed,fuelType);}
        void brake(){
            System.out.println("Bicycle is stopping");
        }
        void accelerate(){
            System.out.println("Bicycle accelerates");
        }
        void noDriverLicence(){
            System.out.println("No driver licence required");
        }
}
