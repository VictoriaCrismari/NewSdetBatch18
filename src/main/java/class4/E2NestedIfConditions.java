package class4;

public class E2NestedIfConditions {
    public static void main(String[] args) {
        double budget = 21000;
        String engineType = "Electric";
        if (budget >= 50000) {
            if (engineType.equals("Electric")) {
                System.out.println("I want to buy a tesla");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Toyota");
            } else {
                System.out.println("I want to buy a Porche");
            }
        } else if (budget >= 30000) {
            if (engineType.equals("Electric")) {
                System.out.println("I want to buy BYD");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Camry");
            } else {
                System.out.println("Hyunday Sonata");
            }

        } else if (budget >= 20000) {
            if (engineType.equals("Electric")) {
                System.out.println("Nissan Leaf");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("Kia");
            } else {
                System.out.println("Honda Civic");
            }
        } else {
            System.out.println("Let's save more");
        }
    }
    }