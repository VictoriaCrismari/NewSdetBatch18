package class14;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployee n1=new SyntaxEmployee();
        n1.empId=51441;
        n1.salary=7800;
        n1.printInfo();
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee n2=new SyntaxEmployee();
        n2.empId=56478;
        n1.salary=8900;
        n1.printInfo();
        System.out.println(SyntaxEmployee.CEO);
    }
}
