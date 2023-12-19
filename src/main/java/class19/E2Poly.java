package class19;

public class E2Poly {
    public static void main(String[] args) {
        Dog d1=new Dog("Jacky","Brown",10,25);
        Dog d2=new Dog("Macky","black",10,25);
        Cat c1=new Cat("Lilu","black",2,5);
        Animal a1=new Animal("Lola","brown",10,12);
        Animal [] arr={d1,d2,c1,a1};
        Animal animal=arr[0];
        animal.printInfo();

    }
}
