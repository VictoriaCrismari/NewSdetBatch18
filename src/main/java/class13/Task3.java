package class13;

public class Task3 {
    //Write a method to return whether
    // given number is prime or not?
    void prime(int num){
        boolean IsPrime=true;
        for(int i=2 ; i<=num/2; i++){
            if(num%i==0){
                IsPrime=false;
            }
        }
        if(IsPrime){
            System.out.println(num +" is Prime");
        } else {
            System.out.println(num +"  is not prime");
        }
    }
}
