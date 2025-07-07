import java.util.Scanner;

class Mobile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeGame game = new ShapeGame(); // Object creation

        char continueGame; // Variable to check if the user wants to continue

        // Replaced `while` loop with `do-while`
        do {
            game.startGame();
            System.out.print("Do you want to continue? (Press Y/y for Yes, N/n for No): ");
            continueGame = sc.next().charAt(0); // Read user input for continuation
        } while (continueGame == 'Y' || continueGame == 'y'); // Continue if user enters Y/y

        // Exit message when the user chooses not to continue
        System.out.println("Thank you for playing Shape Game!");
    }
}