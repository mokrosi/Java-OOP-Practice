// Task 2:Method in Class Create a
// class called`Rectangle`with:-
// Two variables:`length`,`width`(double)-
// A method`calculateArea()` that returns the area of the rectangle.
// - Print the area in the `main()` method.

// Expected Output:
// Area of Rectangle: 50.0




public class Rectangle {
    double length ;
    double width ;

    public double calculateArea(){
        double area = length*width;
        return area ;
    }

    public static void main(String[] args) {
        Rectangle Rectangle1 = new Rectangle() ;
        Rectangle1.length = 10 ;
        Rectangle1.width = 5 ;
        System.out.println("Rectangle aree : ");
        System.out.println(">> " + Rectangle1.calculateArea() );
    }
}
