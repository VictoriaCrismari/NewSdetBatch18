package HomeWork;

public class T86C {
    void print (){
        System.out.println("Name is "+name+" and roll number is "+roll_no);
    }
    String name;
    int roll_no;
    public static void main(String[] args) {
        T86C m=new T86C();
        m.roll_no=2;
        m.name="John";
        m.print();

    }
}
