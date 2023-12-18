package class18;

public class Book {
    //3)Library Management System:
    //Create a base class Book with attributes like title, author, and ISBN.
    //Develop two subclasses: EBook and PrintBook. In EBook, add a property
    //for download_link, and in PrintBook, add a property for number_of_copies.Implement a method in each subclass that displays book details.
    //Instantiate objects from these classes and demonstrate the display functionality.
    private String title, author;
    private int ISBN;
    public Book(String title,String author,int ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    public void printInfo(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+ISBN);

    }

}
class EBook extends Book{
    private String downloadLink;
    public EBook(String title,String author,int ISBN,String downloadLink){
        super(title,author,ISBN);
        this.downloadLink=downloadLink;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Download link "+downloadLink);
    }
}
class PrintBook extends Book{
    private int NrOfCopies;
    public PrintBook(String title,String author,int ISBN,int NrOfCopies){
        super(title, author, ISBN);
        this.NrOfCopies=NrOfCopies;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Nr of copies : "+ NrOfCopies);
    }
}
class BookTester{
    public static void main(String[] args) {
        EBook B1=new EBook("The Perfect Fit","Sadie Kincaid",548765487,"https://amazon.com");
        B1.printInfo();
        PrintBook B2=new PrintBook("Cari Mora","Thomas Harris", 7651541,1200);
        B2.printInfo();
    }
}
