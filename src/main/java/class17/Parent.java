package class17;

public class Parent {
    String name="Israel";
}
class Child extends Parent {
    void print(){
        System.out.println(name);
    }
}
class Tester{
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}
