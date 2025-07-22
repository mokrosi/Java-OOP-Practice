// Task 5:Interface Implementation
//  Create an interface`Shape`with method`getArea()`.
// -Implement it in two classes:`Circle`and`Square`.
// -Each class should have a constructor and override`getArea()` to return correct area.

public interface Shape {
    double getArea();


    public class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return 3.14 * radius * radius;
        }
    }
    
    public class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);

        System.out.println(" Circle Area: " + circle.getArea());
        System.out.println(" Square Area: " + square.getArea());

    }
}
