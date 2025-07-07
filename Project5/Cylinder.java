import java.util.Scanner;

public class Cylinder extends ThreeDshape {
    double radius, height;

    public Cylinder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = sc.nextDouble();
    }

    @Override
    public void getVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Cylinder Volume: " + volume);
    }

    @Override
    public void getTSA() {
        double tsa = 2 * Math.PI * radius * (radius + height);
        System.out.println("Cylinder Total Surface Area: " + tsa);
    }

    @Override
    public void getLSA() {
        double lsa = 2 * Math.PI * radius * height;
        System.out.println("Cylinder Curved Surface Area: " + lsa);
    }
}
