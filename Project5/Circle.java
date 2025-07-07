import java.util.Scanner;

public class Circle extends TwoDshape {
    double radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    @Override
    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle Perimeter: " + perimeter);
    }
}
