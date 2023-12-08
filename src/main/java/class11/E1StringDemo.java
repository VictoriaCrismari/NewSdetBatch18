package class11;

public class E1StringDemo {
    public static void main(String[] args) {
        /*String => data type
        str=> variable name
       new String() =>creating the object of String
        */
        String str=new String("Hello World");
        //calling the lenght method using str object
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        //we can store the results of a method as well
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
    }

}
