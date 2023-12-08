package class13;

public class T3 {
    void palindrome(String s){
        String reversedWord="";
                for (int i=s.length()-1;i>=0;i--){
                    reversedWord=reversedWord+s.charAt(i);
                }if (s.equalsIgnoreCase(reversedWord)){
                System.out.println("It's a Palindrome");
            }else {
                System.out.println("It's not a Palindrome");
            }
        }
    }

