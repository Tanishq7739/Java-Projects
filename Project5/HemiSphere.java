import java.util.Scanner;

public class HemiSphere extends ThreeDshape {
    double radius;

    public HemiSphere() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere: ");
        radius = sc.nextDouble();
    }

    @Override
    public void getVolume() {
        double volume = (2.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Hemisphere Volume: " + volume);
    }

    @Override
    public void getTSA() {
        double tsa = 3 * Math.PI * radius * radius;
        System.out.println("Hemisphere Total Surface Area: " + tsa);
    }

    @Override
    public void getLSA() {
        double lsa = 2 * Math.PI * radius * radius;
        System.out.println("Hemisphere Curved Surface Area: " + lsa);
    }
}
