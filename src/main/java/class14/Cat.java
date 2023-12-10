package class14;

public class Cat {
    String name="kitti";//instance var
    void printName(){
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printName();
    }
}
