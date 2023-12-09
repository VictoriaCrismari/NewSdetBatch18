package HomeWork;

public class T106StringBuilder {
    //Instantiate and StringBuffer class
    //Append Value "Hello" to it
    //Append value "World" to it.
    //Print in UPPERCASE.
    //**Expected Output:**
    //HELLO WORLD
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Hello");
        stringBuffer.append(" World");
        String upperCaseS= stringBuffer.toString().toUpperCase();
        System.out.println(upperCaseS);
    }
}
