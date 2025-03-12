// pillars of OOPS 
// inheritance , polymorphism , encapsulation , abstraction  

/* inheritance works in topdown manner
 * 
 * objects of parent class cannot directly access the members of child class(field , methods() etc...)
 * 
 * class Parent { }
 * class Child extends Parent{ }
 * 
 * single inheritance in java --> means class can extend only one parent class .
 * 
 * super --> used to refer to immediate parent class
 *        -> commonly used to access parent class constructors , methods , or variables 
 *        -> super.methodName();
 * 
 * private --> not inherited 
 * protected --> inherited but accessible only within the same package or through child class
 * public --> fully inherited and accessible
 * default --> inherited within the same package 
 * 
 * final class cannot be inherited and also can't overridden by child class
 * 
 * java doesn't provide multiple inheritance with classes to prevent the Diamond Problem .
 * 
 * 
 * 
 * 
 */



class Box{
   double l;
   double h;
   double w;

   Box(){
    this.h = -1;
    this.l = -1;
    this.w = -1;
   }

   //cube
   Box(double side){

    this.w = side;
    this.l = side;
    this.h = side;

   }

   //cuboid 
   Box(double l, double h , double w){

    this.w = w;
    this.l = l;
    this.h = h;

   }

   Box(Box old){
     this.h = old.h;
     this.l = old.l;
     this.w = old.w;
   }

    public void information(){
        System.out.println("Running the Box");
    }



}

class  BoxWeight extends Box
{
    double weight;

    public BoxWeight(){
        this.weight = -2;
    }

    
    BoxWeight(BoxWeight other) { // other here is box we type
        super(other);
        weight = other.weight;
    }

    

    public BoxWeight (double l , double h, double w, double weight){
        super(l,h,w); // calls parent class constructor
        // System.out.println(super.weight);
        this.weight=weight;
        // the private content in the class cannnot be accessed
    }

    BoxWeight (double side, double weight){
        super(side);
        this.weight = weight;
    }
}

 class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice() {
        super(); // super calls the constructor just above it
          // i.e for boxprice is boxweight 
        this.cost = -1;

    }

     BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l , double h, double w, double weight) {
        super(l,h,w,weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight , double cost){
        super(side, weight);// there must be BoxWeight having two parameters receivers
        this.cost = cost;
    }


 }

/*
 *  super is used to refer the parent class of current class
 *  super must be the first statement if used in child class
 *  java automatically inserts super() if not inserted by us
 *  use of super() ---> super.methodName() , super.variableName 
 * 
 */
public class OOPS3ainheritance {
    public static void main(String[] args) {
        // constructor overloading 
        // depends upon the datatype and number of parameters passed
        // Box box1 = new Box(4,5,6);
        // Box box2 = new Box(box1);
        // System.out.println(box1.l+" "+box1.w+" "+box1.h);
        // System.out.println(box2.l+" "+box2.w+" "+box2.h);
        
        // BoxWeight box3 = new BoxWeight(1,2,3,4);
        // System.out.println(box3.h+" "+box3.weight);
        
        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,8);
        // System.out.println(box3.h+" "+box3.weight);

          Box box5 = new BoxWeight(2,3,4,8);
          //Parent obj = new Child(); // Upcasting 
          // assigning  a child class object to parent class reference.
          // the reference type (parent class ) restricts the access to the parent class (methods()) even if the object is of child class

        // in JAVA inheritance -> the reference type, not the actual object, determines what members (methods and fields)
        // can be accessed when upcating occurrs . 

        //   System.out.println(box5.weight); //can't (error)

        System.out.println(box5.w);
       
        // the refernce type is child class and object of parent class
        // the object of parent class don't what are there in child class i.e here BoxWeight
        // thats why here is error  
        // BoxWeight box6 = new Box(2,3,4); // downcasting 

        // System.out.println(box6);
    
        BoxPrice box = new BoxPrice();
        System.out.println();
    }
}

/*
 *  types of Inheritance
 * 
 * 1) single inhritance --> one class extends another class --> box(parent )--> boxWeight(child)
 * 
 * 2) multilevel inheritance --> box(parent class) --> boxWeight(subclass) --> boxprice(childclass)
 * 
 * 3) multiple inhritance --> one class extending more than one class
 *   class A and class B Are( parent class) --> class C ( childclass) extending both A and B
 *    this is not supported by JAVA 
 *    
 *     interface helps in this case --> study later
 * 
 *  4) hierarchial inheritance --> one class is inherited by many classes
 *    class(Parent class) ---> class B,C,D are (child class)
 * 
 *   but b can't access c and D but it extends only A 
 * 
 *  5) Hybrid inheritance --> Combination of single and multiple inheritance 
 *     not supported in  JAVA 
 * 
 *   Note- A class can't inherit itself
 * i.e class A extends A ; error//
 * 
 * parent class == super class
 * child class == subclass
 */ 