import java.util.Scanner;

public class Triangle extends TwoDshape {
    double base, height, side1, side2;

    public Triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();
        System.out.print("Enter the other two sides of the triangle: ");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
    }

    @Override
    public void getArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = base + side1 + side2;
        System.out.println("Triangle Perimeter: " + perimeter);
    }
}
