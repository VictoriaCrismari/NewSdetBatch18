package class16;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher T = new Teacher();
        T.joke();

       Teacher.MathTeacher mt=new Teacher.MathTeacher();
        mt.hoursOfTeaching=45;
        mt.teachMath();
    }
}
