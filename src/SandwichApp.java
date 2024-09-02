import java.util.Scanner;

public class SandwichApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOrdering = true;

        while (continueOrdering) {
            System.out.println("=== Select Sandwich Bread: ===");
            System.out.println("1 White Bread $1.5");
            System.out.println("2 Wheat Bread $1.6");
            System.out.println("3 French Bread $1.8");
            System.out.println("4 Organic Bread $2.0");
            System.out.print("Select a bread [1, 4]: ");
            int breadChoice = Validation.getIntInRange(scanner, 1, 4);

            Sandwich sandwich = new Sandwich();
            switch (breadChoice) {
                case 1 -> sandwich.setBread("White Bread", 1.5);
                case 2 -> sandwich.setBread("Wheat Bread", 1.6);
                case 3 -> sandwich.setBread("French Bread", 1.8);
                case 4 -> sandwich.setBread("Organic Bread", 2.0);
            }

            boolean selectingVegetables = true;
            while (selectingVegetables) {
                System.out.println("=== Select Sandwich Vegetables: ===");
                System.out.println("1 red onions $0.05");
                System.out.println("2 olives $0.10");
                System.out.println("3 pickles $0.10");
                System.out.println("4 lettuce $0.20");
                System.out.println("5 green peppers $0.25");
                System.out.println("6 tomatoes $0.30");
                System.out.println("7 cheese $0.50");
                System.out.println("8 Quit vegetable selection");
                System.out.print("Select vegetables [1, 8]: ");
                int vegetableChoice = Validation.getIntInRange(scanner, 1, 8);

                switch (vegetableChoice) {
                    case 1 -> sandwich.addVegetable("red onions", 0.05);
                    case 2 -> sandwich.addVegetable("olives", 0.10);
                    case 3 -> sandwich.addVegetable("pickles", 0.10);
                    case 4 -> sandwich.addVegetable("lettuce", 0.20);
                    case 5 -> sandwich.addVegetable("green peppers", 0.25);
                    case 6 -> sandwich.addVegetable("tomatoes", 0.30);
                    case 7 -> sandwich.addVegetable("cheese", 0.50);
                    case 8 -> selectingVegetables = false;
                }
            }

            System.out.println("=== Select Sandwich Meat: ===");
            System.out.println("1 Ham $1.0");
            System.out.println("2 Roasted Chicken Breast $1.1");
            System.out.println("3 Turkey Breast $1.2");
            System.out.println("4 Roast Beef $1.5");
            System.out.println("5 Quit meat selection");
            System.out.print("Select meat [1, 5]: ");
            int meatChoice = Validation.getIntInRange(scanner, 1, 5);

            switch (meatChoice) {
                case 1 -> sandwich.setMeat("Ham", 1.0);
                case 2 -> sandwich.setMeat("Roasted Chicken Breast", 1.1);
                case 3 -> sandwich.setMeat("Turkey Breast", 1.2);
                case 4 -> sandwich.setMeat("Roast Beef", 1.5);
                case 5 -> System.out.println("No meat selected.");
            }

            System.out.print("Enter customer's full name: ");
            String customerName = scanner.nextLine();

            Order order = new Order(customerName, sandwich);
            System.out.println(order);
            SandwichIO.writeOrderToFile(order);

            System.out.print("Continue to order more sandwiches? (y/n): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("y")) {
                continueOrdering = false;
            }
        }

     scanner.close();
    }	
}