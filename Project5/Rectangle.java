import java.util.Scanner;

public class Rectangle extends TwoDshape {
    double length, breadth;

    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    @Override
    public void getArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
