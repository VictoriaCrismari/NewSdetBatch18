package HomeWork;

public class T87C {
    //Create a class named 'Main' with specific attributes.
    //Create two objects of that class in which you will be assigning the following values and then print them.
    //carColor='Black'
    //carYear=2019
    //carMake='BMW'
    //carColor='White'
    //carYear=2018
    //carMake='Toyota'
    //**Expected Output:**
    //Car color is Black and car year is 2019 and car model is BMW
    //Car color is White and car year is 2018 and car model is Toyota
    String carColor;
    String carMake;
    int carYear;
    void Car(){
        System.out.println("Car color is "+carColor+" and the car year is "+carYear+" and the car model is "+carMake);
    }

    public static void main(String[] args) {
        T87C BMW=new T87C();
        BMW.carMake="BMW";
        BMW.carYear=2019;
        BMW.carColor="Black";
        BMW.Car();


        T87C Toyota=new T87C();
        Toyota.carMake="Toyota";
        Toyota.carYear=2018;
        Toyota.carColor="White";
        Toyota.Car();
    }

}
