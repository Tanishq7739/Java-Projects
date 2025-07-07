import java.util.Scanner;

class TwoDshape {
    Scanner sc = new Scanner(System.in);

    public void chooseTwoDShape() {
        // Menu for 2D shapes
        System.out.println("Choose a 2D Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // **Polymorphism**: Calls appropriate method based on user choice
        if (choice == 1) {
            Circle circle = new Circle(); // Child class instance
            circle.getArea(); // **Method Overriding**
            circle.getPerimeter(); // **Method Overriding**
        } else if (choice == 2) {
            Triangle triangle = new Triangle(); // Child class instance
            triangle.getArea(); // Same overriding concept
            triangle.getPerimeter();
        } else if (choice == 3) {
            Rectangle rectangle = new Rectangle(); // Child class instance
            rectangle.getArea();
            rectangle.getPerimeter();
        } else {
            // **Recursion**: Returns to the main menu
            System.out.println("Invalid choice! Returning to Shape Game menu...");
            ShapeGame game = new ShapeGame(); 
            game.startGame(); // Recalls the main game
        }
    }

    public void getArea() {
        // **Inheritance**: Default method from parent class
        System.out.println("Calculating 2D Shape Area...");
    }

    public void getPerimeter() {
        // Same as above, default implementation
        System.out.println("Calculating 2D Shape Perimeter...");
    }
}
