package class13;

public class Task2 {
    //Create a method that will say Hello in different language based on the country
    // that will passed when method is executed. Do it for any five countries
    void Hello(String country){
        if(country.equalsIgnoreCase("Moldova")){
            System.out.println("Salut");
        } else if (country.equalsIgnoreCase("USA")) {
            System.out.println("Hello");
        }else if (country.equalsIgnoreCase("'Russia")){
            System.out.println("Privet");
        } else if (country.equalsIgnoreCase("France")) {
            System.out.println("Bonjour");
        } else if (country.equalsIgnoreCase("China")) {
            System.out.println("nín hǎo");
        }
    }

}
