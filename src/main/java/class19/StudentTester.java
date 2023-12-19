package class19;

public class StudentTester {
    public static void main(String[] args) {
        Student [] students={new SyntaxStudent(),new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i <students.length ; i++) {
students[i].homework();
students[i].exam();
students[i].study();
        }
    }
}
