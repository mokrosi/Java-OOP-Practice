// Task 4:Inheritance and Method Overriding Create:
// -A base class`Animal`with a method`sound()`that prints"Some sound".
// -A subclass`Dog`that overrides`sound()`to print"Dog barks".
// Expected Output:
// Dog barks

public class Animal {

    public void sound(){
        System.out.println("Some sound");
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog Dog1 = new Dog();
        Dog1.sound();
    }
}


