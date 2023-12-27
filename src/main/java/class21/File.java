package class21;

public abstract class File {
    private String name;
    private double size;
    public File(String name,double size){
        this.name=name;
        this.size=size;
    }
    abstract void open();
    void edit(){System.out.println("This method will edit your file");}
    void close(){System.out.println("This method will close your file");}
}
class JavaFile extends File{
    public JavaFile(String name, double size) {super(name,size);}
    void open(){
        System.out.println("You need notepad++ or sublime text");
    }

}
class WordFile extends File{
    WordFile(String name,double size){
        super(name, size);
    }
    void open(){
        System.out.println("You need Microsoft 360");
    }

}
class PdfFile extends File{

    public PdfFile(String name, double size) {
        super(name, size);
    }

    void open(){
        System.out.println("You need adobe reader");
    }

}
class FileTester{
    public static void main(String[] args) {
        File[] arr = {new JavaFile("Notepad", 65), new WordFile("Microsoft", 85), new PdfFile("Adobe", 98)};
        for (File f : arr) {
            f.open();
            f.edit();
            f.close();
        }
    }
}

