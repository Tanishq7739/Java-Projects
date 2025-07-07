import java.util.Scanner;

public class ShapeGame { // Entry point class
    Scanner sc = new Scanner(System.in);

    public void startGame() {
        // Welcome message and main shape options
        System.out.println("Welcome to Shape Game!");
        System.out.println("Press 1 for 2D Shape");
        System.out.println("Press 2 for 3D Shape");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // **Inheritance**: TwoDshape is used as a child class
            TwoDshape twoD = new TwoDshape(); 
            twoD.chooseTwoDShape(); // **Polymorphism**: Calls appropriate method based on the shape type
        } else if (choice == 2) {
            // **Inheritance**: ThreeDshape is used as a child class
            ThreeDshape threeD = new ThreeDshape();
            threeD.chooseThreeDShape(); // Same as above
        } else {
            // **Recursion**: Restart the game on invalid input
            System.out.println("Invalid choice! Please try again.");
            startGame();
        }
    }

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
