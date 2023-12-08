package class9;

public class T4 {
    public static void main(String[] args) {
        String[][] list={
                {"broccoli","cauliflower","carrots","lettuce"},
                {"apples","pears","kiwi","grapes","strawberries"},
                {"cheese","whipping cream","milk"},
                {"cookies","candy","chocolate"}
        };
        for (int i=0;i< list.length;i++){
            for (int j=0;j<list[i].length;j++)
         System.out.print(list[i][j]+" ");
            System.out.println("");}
        System.out.println("");
        System.out.println("Using Enhanced Loop");
        for (String [] array:list){
            for (String grocery:array){
                System.out.print(grocery+" ");
            }
            System.out.println("");
        }


}}
