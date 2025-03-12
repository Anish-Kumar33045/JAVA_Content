
import java.util.Arrays;

/*
 Object cloning is the process of creating a new object that is an exact copy of an existing object.
 The new object has the same fields and objects as the original. 
 To enable cloning, the class must implement the Cloneable interface.


  cloning is a mechanism to create an exact copy of an object. This is often used when 
  you need a duplicate object with the same properties but want the new object to be independent of the original.
 */

 public class OOPS6hOBJECTcloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating an original object
        Human anish = new Human(19, "Anish Kumar");

        // Creating a clone of the original object
        Human twin = (Human) anish.clone(); // Cast the cloned object to Human type

         //printing the details of actual object anish
         System.out.println("actual object details");
         System.out.println(anish.name+" "+anish.age);
         System.out.println(Arrays.toString(anish.arr));
         
         // Printing the details of the cloned object
         System.out.println("twin object details");
        System.out.println(twin.name + " " + twin.age);
        System.out.println(Arrays.toString(twin.arr));
        
        twin.age = 34;
        System.out.println(twin.age+"twin age after change");
        System.out.println(anish.age+"twin age after change not affecting anish");
        // simliarly for name 

        //changing the twin.arr also changes actual object 
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(anish.arr)); // anish.arr also changed 

        // changing the twin.arr cahnges anish.arr because twin don't actually copy the elements present in array of anish.arr 
        // instead it actually points reference so changes made in twin also affects anish object
        // this shallow copy 

        


    }
}
/*
 What is Cloneable?
 * Cloneable is a marker interface in Java (java.lang.Cloneable).
 * It does not have any methods to implement.
 * Its purpose is to signal to the Object.clone() method that the object's class allows its instances to be cloned.
 * If a class does not implement Cloneable and you call the clone() method, a CloneNotSupportedException is thrown.
  
   What is the clone() Method?
The clone() method is defined in the Object class.

It is used to create and return a copy of the object on which it is called.

By default, the clone() method performs a shallow copy of the object.

example code : protected Object clone() throws CloneNotSupportedException
This method is protected in the Object class, so you need to override it in your class to make it accessible.

  how to use cloning in JAVA ??
 Implement the Cloneable interface in your class.
Override the clone() method in your class and make it public (or accessible).



 */
class Human implements Cloneable { // Implement Cloneable interface otherwise throws CloneNotSupportedException
    int age;
    String name;
    int arr[] ;

    // Constructor to initialize fields
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=  new int[] {3,4,5,6,7};
    }

    // Copy constructor (not used in this example but useful for manual cloning)
    // public Human(Human other) {
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    // Overriding the clone method (shallow copy )
    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     // this is shallow copy
    //     return super.clone(); // Call the superclass clone method
    // }


    // Overriding the clone method (deep copy )
    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is deep copy
        Human twin = (Human)super.clone(); // this is actually shallow copy

        //make deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length ; i++) {
            twin.arr [i] = this.arr[i];
        }
        return twin;
    }


}
