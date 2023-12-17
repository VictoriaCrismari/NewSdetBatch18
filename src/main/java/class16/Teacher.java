package class16;

public class Teacher {
    String name;
    int age;
    int salary;
    int hoursOfTeaching;

    void teach (){
        System.out.println("teaching");}
    void joke(){
        System.out.println("hahaha");}

    static class MathTeacher extends Teacher{
        void teachMath(){
            System.out.println("Teaching Math");
        }
    }
    class ChemistryTeacher{
        void teachChem(){
            System.out.println("HCl is salt");
        }
    }
    class PianoTeacher{
        void teachPiano(){
            System.out.println("Teaching piano");
        }
    }
}
