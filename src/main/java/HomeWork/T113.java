package HomeWork;

public class T113 {
    //Step1: Create a method that will accept with 2 parameters of integer type
    //Step2: Write the logic in that method in println statement to print hours and minutes
    //Step3: Call the method
    //**Expected Output:**
    //11:30

    private int time1;
    private int time2;

    public T113(int time1,int time2){
        this.time1=time1;
        this.time2=time2;
    }
    public void currentTime(){
        System.out.println(time1+":"+time2);
    }

    public static void main(String[] args) {
        T113 T=new T113(11,30);
        T.currentTime();

    }
}
