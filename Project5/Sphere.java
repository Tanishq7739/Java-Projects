import java.util.Scanner;

public class Sphere extends ThreeDshape {
    double radius;

    public Sphere() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = sc.nextDouble();
    }

    @Override
    public void getVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Sphere Volume: " + volume);
    }

    @Override
    public void getTSA() {
        double tsa = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Total Surface Area: " + tsa);
    }

    @Override
    public void getLSA() {
        // For a sphere, TSA and LSA are the same
        getTSA();
    }
}
