package class12;

public class T5 {
    public static void main(String[] args) {
        String sentence="This is sentence I want to reverse";
        String [] sentence2=sentence.split(" ");
        for (String s:sentence2){
            for (int i=s.length()-1;i>=0;i--){
                System.out.print(s.charAt(i));
            }System.out.print(" ");
        }

           }
    }

