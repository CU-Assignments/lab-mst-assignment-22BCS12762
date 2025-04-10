// Define the interface
interface Shape {
    // Abstract methods
    double area();
    double perimeter();
}

// Implement the interface in a class
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the area method
    @Override
    public double area() {
        return length * width;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Another class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to demonstrate the abstraction
public class AbstractionExample {
    public static void main(String[] args) {
        // Create a Rectangle object
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        // Create a Circle object
        Shape circle = new Circle(4);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }
}
