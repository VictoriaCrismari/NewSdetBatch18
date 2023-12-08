package review6class;

public class Person {
    String name;
    int age;
    double weight, height;
    void eat(){
        System.out.println("Eating....");
    }String getName(){
        return name;
    }

    public static void main(String[] args) {
        Person P=new Person();
        P.name="Victoria";
        P.age=22;
        P.height=5.4;
        P.weight=120;
        System.out.println(P.name);
        P.eat();
        String n=P.getName();
    }
}
