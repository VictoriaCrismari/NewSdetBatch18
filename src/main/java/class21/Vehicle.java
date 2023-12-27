package class21;


public abstract class Vehicle {
    /*2)Vehicle Management System: Design a base class Vehicle with methods
    like startEngine(), stopEngine(), fuelUp(), and fields like make, model, and fuelLevel.
    Create subclasses like Car, Truck, and Motorcycle, each with specific
    implementations for the methods, considering their unique characteristics. */
    private String make,model,fuelLevel;
    Vehicle(String make,String model,String fuelLevel){
        this.make=make;
        this.model=model;
        this.fuelLevel=fuelLevel;
    }
    abstract void startEngine();
    abstract void stopEngine();
    abstract void fuelUp();
    void printInfo(){
        System.out.println(make+" "+model+" "+fuelLevel);
    }
}
class Car extends Vehicle {
    Car(String make,String model,String fuelLevel){
        super(make, model, fuelLevel);
    }
    void startEngine(){
        System.out.println("Car starts the engine");
    }
    void stopEngine(){
        System.out.println("Car stops the engine");
    }
    void fuelUp(){
        System.out.println("Car tank is half full");
    }
}
class Truck extends Vehicle{
    Truck(String make,String model,String fuelLevel){
        super(make, model, fuelLevel);
    }

    @Override
    void startEngine() {
        System.out.println("Truck starts the engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Truck stops the engine");
    }

    @Override
    void fuelUp() {
        System.out.println("Truck tank is full");
    }
}
class Motorcycle extends Vehicle {
    Motorcycle(String model, String make, String fuelLevel) {
        super(make, model, fuelLevel);}
        void startEngine(){
            System.out.println("Motorcycle starts the engine");
        }
        void stopEngine(){
            System.out.println("Motorcycle stops the engine");
        }

    @Override
    void fuelUp() {
        System.out.println("Motorcycle tank is full");
    }
}
class VehicleTester{
    public static void main(String[] args) {
        Vehicle [] arr={new Car("Honda","Pilot","full tank"),
                new Truck("Peterbilt","579","full tank"),
                new Motorcycle("X-Pro","250cc","full tank")};
                for (Vehicle v:arr){
                    v.printInfo();
                    v.startEngine();
                    v.stopEngine();
                    v.fuelUp();
                }
    }
}
