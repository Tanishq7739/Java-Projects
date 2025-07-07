import java.util.Scanner;

public class ProductPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the number of products
        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();

        double cost = 0;

        if (quantity <= 50) {
            cost = quantity * 100;
        } else if (quantity <= 75) {
            cost = (50 * 100) + ((quantity - 50) * 80);
        } else if (quantity <= 100) {
            cost = (50 * 100) + (25 * 80) + ((quantity - 75) * 70);
        } else if (quantity <= 500) {
            cost = (50 * 100) + (25 * 80) + (25 * 70) + ((quantity - 100) * 60);
        } else {
            cost = (50 * 100) + (25 * 80) + (25 * 70) + (400 * 60) + ((quantity - 500) * 245);
        }

        // Output the total cost
        System.out.println("Number of Products: " + quantity);
        System.out.println("Total Cost: " + cost + " Rupees");

        sc.close();
    }
}
