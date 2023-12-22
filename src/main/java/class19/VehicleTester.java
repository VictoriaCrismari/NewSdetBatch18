package class19;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle [] vehicles={new Car("Blue","89",68),new Motorcycle("black","91",45),
                new Truck("Red","Diesel",70),new Bicycle("Silver","no fuel required",25)};
        for (int i=0;i<vehicles.length;i++){
            Vehicle v=vehicles[i];
            v.brake();
            v.accelerate();
            v.printInfo();
        }
    }
}
