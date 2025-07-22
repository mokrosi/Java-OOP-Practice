// Task 7: Abstract Class
// Create an abstract class `Vehicle` with an abstract method `start()`.
// - Create two subclasses: `Car` and `Bike`, and implement the `start()` method for each.

// Expected Output:
// Car is starting
// Bike is starting


abstract class Vehicle {
    abstract void start();

    class  Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car is starting");
        }
    }

    class Bike extends Vehicle {
        @Override
        void start() {
            System.out.println("Bike is starting");
        }
    }

    public class Main {
        public void main(String[] args) {
            Vehicle myCar = new Car();
            Vehicle myBike = new Bike();

            myCar.start(); 
            myBike.start(); 
        }
    }

}
