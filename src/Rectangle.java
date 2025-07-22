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
