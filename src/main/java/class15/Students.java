package class15;

public class Students {
    private String name;
    private int grade1,grade2,grade3;
    public Students(String sName,int sGrade1,int sGrade2,int sGrade3){

        name=sName;
        grade1=sGrade1;
        grade2=sGrade2;
        grade3=sGrade3;}

    public void average(){
        double average=(grade1+grade2+grade3)/3;
        System.out.println(name+" "+average);
    }
}
