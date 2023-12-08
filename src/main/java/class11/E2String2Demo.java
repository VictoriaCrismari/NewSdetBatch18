package class11;

public class E2String2Demo {
    public static void main(String[] args) {
        String str="Batch 18";
        String str2= new String("Batch 18");
        /* Both are creating a new object of string but
        we use the first one*/
        System.out.println(str.length());
        System.out.println(str2.length());
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);
    }
}
