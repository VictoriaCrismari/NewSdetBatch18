package class18;

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }}
class Bachelors extends Degree{

}
class Masters extends Degree{
    public void getPrerequisite(){
        System.out.println("To get a Masters degree we need to have Bachelors Degree");
    }
}
class DegreeTester{
    public static void main(String[] args){
Masters M=new Masters();
M.getPrerequisite();
Bachelors b=new Bachelors();
b.getPrerequisite();
    }
}
