package class5;

import java.util.Scanner;

public class averageScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double quiz,midTerm,finalscore,avgMarks;
        char grade;
        System.out.println("What is the quiz?");
        quiz=sc.nextDouble();
        System.out.println("What is the mid term?");
        midTerm=sc.nextDouble();
        System.out.println("What is the final score? ");
        finalscore=sc.nextDouble();
        avgMarks=(quiz+midTerm+finalscore)/3;
        
        if (avgMarks>=90){
            grade='A';
        } else if (avgMarks>=70) {
            grade='B';
        } else if (avgMarks>=50) {
            grade='C';
        }else {
            grade='F';
        }
        System.out.println("Your grade is "+grade);

    }
}
