

/*
 *  Poly(many) morphism ( ways to represent)
 * 
 *   Types of polymorphism 
 * 1) compile time (or static time ) polmorphism
 *   ---> acheived by method oveloading 
 *   method overloading --> same names , but types, arguments, return types , order (of passing arguments) can be different
 *   
 * 2) Runtime (or Dynamic ) Polymorphism 
 *   --> acheived my method overriding
 *   method overriding ---> 
 */

 class Shapes{

//   final void area (){  
    // static void area () 
 
    /*
     *  static method belongs to class , not the instance. they are resolved during compile time using reference type
     *  and are not tied to runtime object
     * 
     *  Overriding is run time concept , so they don't apply for static methods
     *  
     * static methods are hidden not overriden
     * static method is determined by reference type , not the actual object type 
     * 
     * if they were non static , the o/p depends on runtime and overriding was possible
     * 
     * INshot --> static depends on reference type 
     *            override depends on actual object type 
     */

    void area() 
    {
        System.out.println("I am in Shapes");
    }

 }

 class Circles extends Shapes{
    // this will run when obj of circle is created
    // hence it overridng the parent method
    @Override // this is called annotation
    // also helps to check whether method is overriden or not
    // more info in interfaces concept

    // void area2() // as it's not overriden it gives error

    void area()
    {
        System.out.println("area is pie * r * r ");
    }

 }

 class Squares extends Shapes{
    void area (){
        System.out.println("area is side square");
    }
 }

 class Traiangles extends Shapes{
    void area (){
        System.out.println("area is 0.5 * base * height");
    }
 }


public class OOPS3b_Polymorphism {
    
 public static void main(String[] args) {
    
    /*
       Shapes shape = new Shapes();
       Circles circle = new Circles();
       Traiangles traingle = new Traiangles();
       Squares square = new Squares();

       shape.area();
       circle.area();
       traingle.area();
       square.area();
    
     */
    
 /* 
        // Parent obj = new Child(); // upcasting
       Shapes shapes = new Circles();
         
        shapes.area(); // overides and executes the area() in class circles

        // dynamic method dispacth (below)
        
        // methods that gets called depends on the object's actual type (circles )
        // not in the reference type(Shapes).

        reference use in upcasting
        ---> enables polymorphism
        --> generic handling -->as it helps to deal with the multiple types of shapes here
          using a common reference type allows more flexible and resuable code 

          limitations of upcasting -->
          * child specific methods are not accesible 
          i.e  Shapes shape = new Circles(){
          shape.somSpecificMethods(); // compile time error
          }

          * downcasting may be required
          as upcating hides the method and properties specific to child class
          
           Circles circle =(Circles) shape;
           circle.someSpecificMethods();// works after casting1
*/
              
     
    /*
     *  parent refernce is holding child object
     * 
     *  this type of polymorphism used in runtime
     *  
     */

 }
}


/*
 *  Parent obj = new Child();
    Here, obj is a reference of type Parent, but it points to an instance of the Child class. 
   This is an example of upcasting, where a subclass object is referred to by a superclass reference
 * 
 *  but the version that gets executed is determined at runtime, 
 *  depending on the actual object type (in this case, the Child object).
 *  This is known as dynamic method dispatch (or runtime polymorphism).

     Reference Type vs Object Type

The reference type (Parent) dictates which methods the compiler can access. 
At compile time, the compiler only knows about the methods defined in the Parent class.
The actual method that gets called at runtime is based on the actual object (Child) that the reference points to.
 In other words, even though obj is of type Parent, 
since it refers to a Child object, the overridden area() method in Child will be invoked, if it exists
 * 
 * 
 * Dynamic Memory Dispatch
 This mechanism allows Java to determine at runtime which version of the area() method to invoke, depending on the actual object type (Child).
 This decision is made at runtime, rather than compile-time, which is the essence of polymorphism.
 */

 // simliar example in OOPS3b2
