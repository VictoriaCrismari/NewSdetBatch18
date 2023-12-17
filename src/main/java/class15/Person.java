package class15;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double salary;
    private String favLanguage;

    public Person(String pName, int pAge, double pWeight,double pSalary, String pFavLan){
        name=pName;
        age=pAge;
        weight=pWeight;
        salary=pSalary;
        favLanguage=pFavLan;
    }

    public Person(String pName, int pAge, double pWeight,double pSalary){
        name=pName;
        age=pAge;
        weight=pWeight;
        salary=pSalary;
    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+weight);

    }

}
