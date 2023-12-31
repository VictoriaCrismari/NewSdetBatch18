package class18;

public class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;

    public Animal(String name,String color,int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void sleep(){
        System.out.println("Zzzzzzzzzzz");
    }
    public void speak(){
        System.out.println("Animal speaking");
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }

}
class Dog extends Animal{
    Dog(String a,String b, int c, double d){
        super(a, b, c, d);
    }

    @Override
    public void speak() {
            System.out.println("Wuff, wuff");
        }
    void demo(String str){
        System.out.println(str);
        printLen(str);
    }
    void printLen(String word){
        System.out.println(word.length());
    }
}
