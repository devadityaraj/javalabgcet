class Shape {                                    //Super class
    public void draw() {
        System.out.println("Drawing a shape"); //declared a function
    }

    public double area() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        System.out.println("Drawing a rectangle");  //This is method overriding
    }

    public double area() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(10);
        Shape s2 = new Rectangle(5, 10);
        s1.draw();
        System.out.println("Area of circle: " + s1.area());
        s2.draw();
        System.out.println("Area of rectangle: " + s2.area());
    }
}