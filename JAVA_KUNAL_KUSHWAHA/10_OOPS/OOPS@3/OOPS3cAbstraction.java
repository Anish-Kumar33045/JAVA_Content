
abstract class Car {
    // Abstract method (no implementation here)
    abstract void startEngine();

    // Concrete method (has implementation)
    void applyBrakes() {
        System.out.println("Brakes applied.");
    }
}

class SportsCar extends Car {
    // Provide implementation for the abstract method
    @Override
    void startEngine() {
        System.out.println("Sports car engine started.");
    }
}
// The user only interacts with startEngine() and applyBrakes().
// The details of the engine are hidden inside the implementation of startEngine().

public class OOPS3cAbstraction {
   
   
        public static void main(String[] args) {
            Car myCar = new SportsCar();
            myCar.startEngine(); // You just start the engine, no need to know how it works!
            myCar.applyBrakes();
        }
    
    
}
