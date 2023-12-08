package class13;

public class Task4 {
    //Create  class Student that will have a method getGrade.
    //Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
    void getGrade(int score){
        if(score>=90){
            System.out.println("A");
        } else if (score>=80&&score<90) {
            System.out.println("B");
        }else if (score>=70&&score<80){
            System.out.println("C");
        } else if (score >= 50 && score < 70) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
