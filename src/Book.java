// Task 3: Constructor Overloading
// Create a class `Book` with:
// - Variables: `title`, `author`, `price`
// - Two constructors:
// - One with all three parameters.
// - One with only `title` and `author`, and set `price` = 100.
// - A method `displayInfo()` to print all details.

public class Book {

    String titel;
    String auther;
    double price;

    public Book(String titel, String auther, double price) {
        this.titel = titel;
        this.auther = auther;
        this.price = price;
    }

    public Book(String titel, String auther) {
        this.titel = titel;
        this.auther = auther;
        this.price = 100;
    }

    public void disPlay(){
        System.out.println("book information >>");
        System.out.println("titel : " + titel);
        System.out.println("auther : " + auther);
        System.out.println("price : " + price);
    } 

    public static void main(String[] args) {
        Book Book1 = new Book("Book1" , "ZXC" , 200);
        Book Book2 = new Book("Book2", "abc");

        Book1.disPlay();
        Book2.disPlay();

    }
}
