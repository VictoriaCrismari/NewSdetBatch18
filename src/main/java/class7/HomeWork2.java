package class7;

public class HomeWork2 {
    public static void main(String[] args) {
        //Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).
    String[] names={"Nasima","Jerry","Indira","Hanane","Victoria","Daria"};
    names[0]="Nasima";
    names[1]="Jerry";
    names[2]="Indira";
    names[3]="Hanane";
    names[4]="Victoria";
    names[5]="Daria";
            for (int i=0;i<names.length;i++){
                if (names[i]==("Victoria")){
                    System.out.println(names[i]);
                }
            }
    }
}
