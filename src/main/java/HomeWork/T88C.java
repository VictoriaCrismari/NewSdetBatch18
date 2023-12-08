package HomeWork;

public class T88C {
    //In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
    //Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
    //The output of the program should be as following:
    //Husky can bark
    //Husky can run
    //Husky can play
    //Bulldog can bark
    //Bulldog can run
    //Bulldog can play
    //Labrador can bark
    //Labrador can run
    //Labrador can play
    String breed,color,name;
    void bark(){
        System.out.println(breed+" can bark");
    }void run(){
        System.out.println(breed+" can run ");
    }void play(){
        System.out.println(breed+" can play");
    }

    public static void main(String[] args) {
        T88C dog1=new T88C();
        dog1.breed="Husky";
        dog1.name="Lucy";
        dog1.color="Grey";
        dog1.bark();
        dog1.run();
        dog1.play();

        T88C dog2=new T88C();
        dog2.breed="Bulldog";
        dog2.name="Charlie";
        dog2.color="Black";
        dog2.bark();
        dog2.run();
        dog2.play();

        T88C dog3=new T88C();
        dog3.breed="Labrador";
        dog3.name="Luna";
        dog3.color="White";
        dog3.bark();
        dog3.run();
        dog3.play();
    }

}
