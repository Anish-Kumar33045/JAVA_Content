abstract class Shape {
    abstract void draw();
    void commonMethod() {
        System.out.println("Common behavior for all shapes");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }

    void circleSpecificMethod() {
        System.out.println("This is a Circle-specific method");
    }
}

public class OOPS4cUpcasting {
    
        public static void main(String[] args) {
            // Subclass-specific reference
            Circle circle = new Circle();
            circle.draw();                 // Output: Drawing Circle
            circle.commonMethod();         // Output: Common behavior for all shapes
            circle.circleSpecificMethod(); // Output: This is a Circle-specific method
    
            // Parent class reference (upcasting)
            Shape shape = new Circle();
            shape.draw();                  // Output: Drawing Circle
            shape.commonMethod();          // Output: Common behavior for all shapes
            // shape.circleSpecificMethod(); // Error: Method not accessible through Shape reference
        }
    }
    

