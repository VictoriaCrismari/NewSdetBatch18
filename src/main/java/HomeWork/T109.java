package HomeWork;

public class T109 {
    //1. Create method name it as newLine
    //2. Add print statement inside method body as "newLine method implementation"
    //3. Call newLine method three times
    //**Expected Output:**
    //newLine method implementation
    //newLine method implementation
    //newLine method implementation
    void newLine(){
        System.out.println("newLine method implementation");
    }

    public static void main(String[] args) {
        T109 T=new T109();
        for (int i = 0; i <3 ; i++) {
            T.newLine();
        }
    }
}
