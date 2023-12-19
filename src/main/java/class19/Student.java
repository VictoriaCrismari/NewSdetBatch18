package class19;

public class Student {
    void study(){
        System.out.println("Student is studying");
    }
    void exam(){
        System.out.println("Student is taking an exam");
    }
    void homework(){
        System.out.println("Student is doing homework");
    }
}
class SyntaxStudent extends Student{
    void studyJava(){
        System.out.println("Student is studying Java");
    }
}
class CollegeStudent extends Student{
    void studyScience(){
        System.out.println("Student is studying Science");
    }

}
class SchoolStudent extends Student{
void dontStudy(){
    System.out.println("Student don't want to study");
}
}
