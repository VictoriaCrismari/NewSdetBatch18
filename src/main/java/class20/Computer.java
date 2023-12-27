package class20;

public abstract class Computer {
    //abstract means incomplete
    //abstract is a non access modifier
    //we can't create an object of the abstract class

    public static String type;
    public String name;
    protected int memory;
    String color;

    Computer(String name,int memory,String color){
        this.name=name;
        this.memory=memory;
        this.color=color;
    }

    static void  playSong(){
        System.out.println("I can play music on my "+type);
    }
    protected void printInfo(){
        System.out.println("I have "+name+" computer with "+memory+" memory");
    }
    abstract void executeCode();
    abstract void readEmails();
}
class Apple extends Computer{
    public Apple(String name,int memory,String color){
        super(name, memory, color);
    }
    /*when we provide implementation to the abstract classes we must
    follow rules of Overriding!!!
    Same method and parameters must be the same-method signature and return
    Must be the same
    Acces modifier must be the same or wider
     */

    @Override
    void executeCode() {
        System.out.println("Executing code on "+type+" "+name);
    }
    public void readEmails(){

    }
}