package class15;

public class Book {
    String title;
    String author;
    int noOfPages;
    String publisher;
    double price;

    public Book(String title, String author, int noOfPages, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.publisher = publisher;
        this.price = price;
    }

    public Book(String title, String author, int noOfPages, String publisher){
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.publisher = publisher;
        this.price=price;
    }
    public void  printInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher);
    }
    public void  printAllInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher+" "+price);
    }

    public static void main(String[] args) {
        new Book("Harry Potter","Mola Jutt",1000,"Urdu",120).printAllInfo();
      new Book("Harry Potter","Mola Jutt",1000,"Urdu").printInfo();
    }
}
