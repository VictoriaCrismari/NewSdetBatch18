package review8;

public class Doctor {
    public static String hospital;
    public String firstName,lastName;
    protected String speciality;
    int yearsOfExperience;
    private double salary;

    public Doctor(String firstName,String lastName,String speciality,int yearsOfExperience){
        this.firstName=firstName;
        this.lastName=lastName;
        this.speciality=speciality;
        this.yearsOfExperience=yearsOfExperience;
    }
    public static void work(){
        System.out.println("Doctor work at "+hospital);
    }
    protected void checkVitals(){
        System.out.println(firstName+" "+lastName+" checks vitals on every patient");
    }
    protected void checkVitals(String patient){
        System.out.println(firstName+" "+lastName+" checks vitals on every "+patient);
    }

    void prescribeMedication(String medication){
        System.out.println(firstName+" "+lastName+" prescribed"+medication);
    }
}
class Surgeon extends Doctor{
    String location;
    Surgeon(String firstName,String lastName,String speciality,int yearsOfExperience){
        super(firstName, lastName, speciality, yearsOfExperience);
        this.location=location;
    }
    public void prescribeMedication(String patient){
        System.out.println("Surgeon "+lastName+" prescribed medication to "+patient);

    }
}
