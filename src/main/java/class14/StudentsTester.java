package class14;

public class StudentsTester {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.ID=5489;
        s1.name="Sino";
        System.out.println(Students.NrOfStudents++);

        Students s2=new Students();
        s2.ID=5467;
        s2.name="Karimi";
        System.out.println(Students.NrOfStudents++);

        Students s3=new Students();
        s3.ID=45668;
        s3.name="Dana";
        System.out.println(Students.NrOfStudents++);


    }
}
