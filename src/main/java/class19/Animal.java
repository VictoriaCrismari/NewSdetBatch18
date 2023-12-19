package class19;

public class Animal {
   private String name;
   private String color;
   private int age;
   private double weight;
   public Animal(String name,String color,int age,double weight){
       this.name=name;
       this.color=color;
       this.age=age;
       this.weight=weight;
   }
   public void printInfo(){
       System.out.println(name+" "+color+" "+age+" "+weight);
   }
}
class Dog extends Animal{
    public Dog(String name,String color,int age,double weight){
        super(name, color, age, weight);
    }
    public void bark(){
        System.out.println("Wuff wuff");
    }
}
class Cat extends Animal{
    public Cat(String name,String color, int age, double weight){
        super(name, color, age, weight);
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Animal a = new Animal("Jackie", "white", 1, 20);

        Dog d =(Dog)a;
        d.bark();
        double [] arr={10,20};
        Dog d1=new Dog("Jackie","black",1,12);
        Cat c1=new Cat("Lovley","white",1,12);
        Animal a1=new Animal("Lovley","white",1,12);

    }
}