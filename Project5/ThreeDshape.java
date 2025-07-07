import java.util.Scanner;

public class ThreeDshape {
    Scanner sc = new Scanner(System.in);

    public void chooseThreeDShape() {
        // Menu for 3D shapes
        System.out.println("Choose a 3D Shape:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        System.out.println("4. Hemisphere");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // **Polymorphism**: Calls appropriate method based on user choice
        if (choice == 1) {
            Sphere sphere = new Sphere(); // Child class instance
            sphere.getVolume(); // **Method Overriding**
            sphere.getTSA(); // **Method Overriding**
            sphere.getLSA(); // **Method Overriding**
        } else if (choice == 2) {
            Cylinder cylinder = new Cylinder();
            cylinder.getVolume();
            cylinder.getTSA();
            cylinder.getLSA();
        } else if (choice == 3) {
            Cone cone = new Cone();
            cone.getVolume();
            cone.getTSA();
            cone.getLSA();
        } else if (choice == 4) {
            HemiSphere hemisphere = new HemiSphere();
            hemisphere.getVolume();
            hemisphere.getTSA();
            hemisphere.getLSA();
        } else {
            // **Recursion**: Returns to the main menu
            System.out.println("Invalid choice! Returning to Shape Game menu...");
            ShapeGame game = new ShapeGame();
            game.startGame(); // Recalls the main game
        }
    }

    public void getVolume() {
        // **Inheritance**: Default method from parent class
        System.out.println("Calculating 3D Shape Volume...");
    }

    public void getTSA() {
        // Default implementation
        System.out.println("Calculating 3D Shape Total Surface Area...");
    }

    public void getLSA() {
        // Default implementation
        System.out.println("Calculating 3D Shape Latent Surface Area...");
    }
}
