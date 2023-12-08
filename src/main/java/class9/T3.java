package class9;

public class T3 {
    public static void main(String[] args) {
        String [][] students={
        {"Maria","John","Karimi","Victoria"},
                {"A","B","C","A"}
    };
        int grade=0;
    for(int i=0;i< students[0].length;i++){
        System.out.println(students[0][i]+" has grade "+students[1][i]);
    }

}}
