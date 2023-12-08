package HomeWork;

public class T73Array {
    //Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} and prints all values in one line.
    //**Output:**
    //This is array of strings
    public static void main(String[] args) {
        String[] values= {"This", "is", "array", "of", "strings"};
        for(int i=0;i<= values.length;i++){
            System.out.print(values[i]+" ");
        }
    }
}
