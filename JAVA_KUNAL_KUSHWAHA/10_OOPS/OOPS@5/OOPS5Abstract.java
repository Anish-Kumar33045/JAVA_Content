 // if we use abstract method then mention abstract class
//  final abstract class Parent // can't use use final with abstract as we want the class to be inherited 
abstract class Parent
{
    int age;

    Parent (int age){
      this.age = age;
    }
    // constructor can be created for abstract class??

    abstract void career();
    abstract void character();

    //static methods in abstract class can be created
    static void hello(){
        System.out.println("Hello!");
    }

      // abstract class can contain normal Methods
      void normalMethod(){
        System.out.println("this is normal method ");
      }


}

// the child class has to Override the abstract methods in Superclass(Parent class)
class Son extends Parent 
{  //abstract method cannot have body
    
    Son(int age){
        super(age);
        this.age =age;
    }
    /*
     When to Use @Override??
       You use @Override when:
         Overriding a method from a superclass.
         Implementing a method from an interface

         Why is @Override Important?
Ensures that the overridden method correctly matches the method in the parent class or interface.
Prevents mistakes, such as method name typos or incorrect parameters.
Makes the intention of the code explicit, which improves code maintenance.

However, it is highly recommended to use it whenever overriding or implementing methods 
to avoid bugs and improve code clarity
Technically, it's not mandatory, and the code will compile without it.

     */
    @Override 
   void career (){
   System.out.println("I am going to be Coder");
  }
   
  @Override
  void character (){
  System.out.println("I love Ironman ");
 }

}

class Daughter extends Parent{

  Daughter(int age){
    super(age);
    this.age = age;
  }

    @Override
    void career(){
    System.out.println("I am going to be Doctor");
   }

   @Override
  void character(){
  System.out.println("I love Captain America ");
   }
}

public class OOPS5Abstract {
   public static void main(String[] args) {
    
   Son son = new Son(30);
   son.career();

   son.normalMethod(); //normal method ca also be accessed

   Daughter daughter = new Daughter(24);
   daughter.career();

    // Parent mom = new Parent(); // objects can't be declared and used with abstract class
    
    //static can be accessed
     Parent.hello();
     
      
   }
}
