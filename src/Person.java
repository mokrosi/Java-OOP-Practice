// Task 1:Class and Object Basics Create a
// class called`Person`with:-
// Two variables:`name`(String),`age`(int)-
// A method`display()` that prints the name and age.

// Expected Output:
// Name: Alice
// Age: 25


public class Person {
    
     String name ;
     int age ;

     public void display() {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
     }

     public static void main(String[] args) {
         Person Person1 = new Person() ;
         Person1.name = "Moahmmed" ; 
         Person1.age = 23 ;
         Person1.display();
     }

}
