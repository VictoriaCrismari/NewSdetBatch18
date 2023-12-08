package class11;

public class T3 {
    public static void main(String[] args) {
     String str="FGHJKGFIUyTCFhbjnjbvfcv19640@#$%^*( uhuyg";
     if (!str.isEmpty()){
         int len=str.length();
         if (len%2!=0&&len>3){
             System.out.println(str+" is  " +str.charAt(str.length()/2));
         }
     }
    }
}
