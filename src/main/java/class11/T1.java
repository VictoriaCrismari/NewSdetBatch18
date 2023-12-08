package class11;

public class T1 {
    public static void main(String[] args) {
        String username="user123";
        String password="Ghkfefh56";
        String confirmPassword="pass1234";
        if(username.isEmpty()||password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("Pasword cannot contain username");
        }else if (!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}
