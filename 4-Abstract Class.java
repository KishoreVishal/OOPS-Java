import java.util.Scanner;

abstract class Shape {
    abstract void printArea();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class AreaCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Length: ");
                int l = sc.nextInt();
                System.out.print("Enter Breadth: ");
                int b = sc.nextInt();
                Rectangle r = new Rectangle(l, b);
                r.printArea();
                break;

            case 2:
                System.out.print("Enter Base: ");
                int base = sc.nextInt();
                System.out.print("Enter Height: ");
                int h = sc.nextInt();
                Triangle t = new Triangle(base, h);
                t.printArea();
                break;

            case 3:
                System.out.print("Enter Radius: ");
                int radius = sc.nextInt();
                Circle c = new Circle(radius);
                c.printArea();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
