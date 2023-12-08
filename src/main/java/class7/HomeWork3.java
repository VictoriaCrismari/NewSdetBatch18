package class7;

public class HomeWork3 {
    public static void main(String[] args) {
        //Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array
String [] cars={"BMW","Toyota","Honda","Ford","Jeep","Nissan"};
cars[0]="BMW";
cars[1]="Toyota";
cars[2]="Honda";
cars[3]="Ford";
cars[4]="Jeep";
cars[5]="Nissan";
        for (int i=0;i< cars.length;i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println("");
        int j=0;
        while (j< cars.length){
            System.out.print(cars[j]+" ");
            j++;
        }
    }
}
