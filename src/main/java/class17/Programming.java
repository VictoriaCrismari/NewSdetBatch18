package class17;

public class Programming {
    public Programming(){
        System.out.println("I love programming languages");
    }
    public Programming(String langName){
        System.out.println("I love "+langName);
    }
}
class ProgramingTester {
    public static void main(String[] args) {

        Programming P1 = new Programming();
        Programming P2 = new Programming("Java");
    }
}
