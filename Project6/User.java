import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the money you have: ");
        int money = sc.nextInt();

        VendingMachine vm = new VendingMachine();
        Beverage beverage = vm.enterMoney(money); // Upcasting to Beverage

        System.out.println("Thank you for using the Beverage Vending Machine!");
    }
}
