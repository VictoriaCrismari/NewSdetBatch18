package class13;

public class Task1 {
    //Create a method createEmail(). Based on values of users
    // firstName, lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String createEmail(String firstName,String lastName,String emailType){
        String email=firstName+lastName+"@"+emailType+".com";
        System.out.println(email);
        return (email);
    }
}
