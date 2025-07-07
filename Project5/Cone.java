import java.util.Scanner;

public class Cone extends ThreeDshape {
    double radius, height, slantHeight;

    public Cone() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cone: ");
        radius = sc.nextDouble();
        System.out.print("Enter the height of the cone: ");
        height = sc.nextDouble();
        slantHeight = Math.sqrt(radius * radius + height * height);
    }

    @Override
    public void getVolume() {
        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
        System.out.println("Cone Volume: " + volume);
    }

    @Override
    public void getTSA() {
        double tsa = Math.PI * radius * (radius + slantHeight);
        System.out.println("Cone Total Surface Area: " + tsa);
    }

    @Override
    public void getLSA() {
        double lsa = Math.PI * radius * slantHeight;
        System.out.println("Cone Curved Surface Area: " + lsa);
    }
}
