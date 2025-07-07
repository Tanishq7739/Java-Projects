import java.util.Scanner;
// Class for Vending Machine
class VendingMachine {
    // Method to accept money and return the selected beverage
    public Beverage enterMoney(int amount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Beverage Vending Machine!");
        System.out.println("1. Coffee (125 Rs per cup)");
        System.out.println("2. Juice (199 Rs per cup)");
        System.out.println("3. Wine (269 Rs per cup)");
        System.out.println("4. Tea (99 Rs per cup)");
        System.out.print("Please select your beverage: ");
        int choice = sc.nextInt();

        Beverage selectedBeverage;

        if (choice == 1) {
            selectedBeverage = new Coffee(); // Upcasting to Beverage
        } else if (choice == 2) {
            selectedBeverage = new Juice(); // Upcasting to Beverage
        } else if (choice == 3) {
            selectedBeverage = new Wine(); // Upcasting to Beverage
        } else if (choice == 4) {
            selectedBeverage = new Tea(); // Upcasting to Beverage
        } else {
            System.out.println("Invalid choice! Defaulting to Coffee.");
            selectedBeverage = new Coffee(); // Upcasting to Beverage
        }

        System.out.print("Enter the number of cups: ");
        int numCups = sc.nextInt();

        selectedBeverage.drink(numCups, amount); // Runtime polymorphism

        return selectedBeverage;
    }
}
