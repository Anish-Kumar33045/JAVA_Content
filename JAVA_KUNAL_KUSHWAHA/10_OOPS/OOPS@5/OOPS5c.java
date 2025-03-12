// Demonstrating the usage of interfaces, nested interfaces, default methods, and static methods
interface A {
    // Default method in interface A
    default void fun() {
        System.out.println("I am in A");
    }

    // Static method in interface A (accessible using the interface name)
    static void Hi() {
        System.out.println("I am Hi() in static A");
    }
}

interface B extends A {
    // Default method in interface B
    default void greet() {
        System.out.println("I am in B");
    }
}

// Nested interface within a class
// Note: Nested interfaces can be declared private, protected, or public
class C {
    public interface NestedInterface {
        boolean isOdd(int num); // Abstract method to check if a number is odd
    }
}

// Class implementing a nested interface
class D implements C.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        // Using bitwise AND to check if a number is odd
        return (num & 1) == 1;
    }
}

// Main class implementing multiple interfaces A and B
// Note: When implementing multiple interfaces, we must resolve method conflicts, if any
public class OOPS5c implements A, B {
    @Override
    public void fun() {
        // Overriding the default method from interface A
        System.out.println("I am in Main fun");
    }

    @Override
    public void greet() {
        // Overriding the default method from interface B
        System.out.println("I am in Main greet");
    }

    public static void main(String[] args) {
        // Creating an object of OOPS5c
        OOPS5c obj = new OOPS5c();
        
        // Calling the static method from interface A using the interface name
        A.Hi();

        // Calling methods overridden in OOPS5c
        obj.fun();   // Output: I am in Main fun
        obj.greet(); // Output: I am in Main greet

        // Creating an object of class D and checking if a number is odd
        D obj1 = new D();
        System.out.println("Is 5 odd? " + obj1.isOdd(5)); // Output: true
    }
}
/*
 * Purpose: Interfaces are used to achieve abstraction and multiple inheritance in Java.
 * 
 * Abstract methods in an interface are methods that only have a declaration (a method signature) but no body (no implementation).
 * interface Example {
    void doSomething(); // This is an abstract method.
}

By default, these methods are implicitly public and abstract, meaning you don't need to explicitly write public abstract before the method name

 note : The Car class provides the body for the start method, so it’s a concrete class that can be instantiated.
        The Bike class doesn’t provide the body for start, so it remains abstract and cannot be instantiated.

 // Defining an interface with an abstract method
interface Vehicle {
    void start(); // Abstract method (implicitly public and abstract)
}

// A concrete class implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

// An abstract class implementing the interface (no obligation to define the method)
abstract class Bike implements Vehicle {
    // Bike doesn't implement 'start', so it remains abstract
}

   A top-level interface is an interface that is declared directly within a package, not inside any class, interface, or other structure. 
   It is a standalone type, much like a class, and can exist independently in your program.
 */