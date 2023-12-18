package class18;

public class Product {
    //Online Shopping Cart:
    //Construct a class Product with attributes like product_name, price, and quantity.
    //Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
    //Override a method in DiscountedProduct to calculate the price after applying the discount.
    //Create instances of both classes and show how prices are calculated
    private String productName;
     double price;
     int quantity;
    public Product(String productName, double price, int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
    public void priceCalc(){
        double finalPrice=price*quantity;
        System.out.println("The price for your purchase is "+finalPrice);
    }
}
class DiscountedProduct extends Product{
    public DiscountedProduct(String productName, double price, int quantity){
        super(productName, price, quantity);
    }
    public void priceCalc(){
        double finalPrice=price*quantity*0.75;
        System.out.println("The price for your purchase with a 25% discount is "+finalPrice);
    }

}
class ProductTester{
    public static void main(String[] args) {
        Product p1=new Product("Tomatoes",2.56,8);
        p1.priceCalc();
        DiscountedProduct p2=new DiscountedProduct("Cucumbers",2.89,5);
        p2.priceCalc();
    }
}
