package review12;

public class Exception2 {
    public static void main(String[] args) {
    int number=10;
        System.out.println(1);
        System.out.println(2);
        try{
        int [] arr=new int[2];
        arr[5]=10;
    }

        catch (ArrayIndexOutOfBoundsException a){
        a.printStackTrace();
        //  System.out.println(a);
        // System.out.println(a.getMessage());
    }
        System.out.println(3);


}
}
