package class3;

public class E1ElseIfQuiz {
    public static void main(String[] args) {
        int age=31;
        if (age<10){
            System.out.println("Baby");
        } else if (age<20) {
            System.out.println("Teenager");
        } else if (age<30) {
            System.out.println("Young");
        } else if (age<40) {
            System.out.println("Still young");
        }else if(age<50){
            System.out.println("A little old");
        }else if(age<60){
            System.out.println("Old");
        }
    }
}
