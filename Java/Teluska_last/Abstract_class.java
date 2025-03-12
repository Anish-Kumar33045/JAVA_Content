/*

abstract class A       
{
    

      public abstract void show();
      public abstract void config();
       
}



public class Abstract_class{
    public static void main (String arg[]){
           
         A obj = new A();
         obj.show();
         

        


    }

}
*/

// class - class ---> extends
// class - interface ---> impelments
// interface - interface ---> extends 
interface  A       
{
    
    //  int age ;          //the variables declared inside the interface is 
                        // by default final and static 
     int age = 19;
     
    //  String area ; 
    String area = " Bangalore "; 


      public void show();
      public void config();
       
}

interface X {
    void run();
}
interface Y extends X
{
   
}


class B implements A,X      // class can implements both the intefaces
{                           //define methods or it will be abstract by default 
     public void show()
    {
        System.out.println(" in B show ");
    }

    public void config()
    {
        System.out.println(" in B config ");
    }
    public void run(){
        System.out.println("running ...");
    }
}


public class Abstract_class{
    public static void main (String arg[]){
           
         A obj ;
        //   obj = new A();  // gives error .

        // we can't create object of A but we can do B 

         obj = new B();
         obj.show();
         obj.config();

        //   A.area = " Hyderabad"; // gives area since it is final 
           System.out.println(A.age);
         System.out.println(A.area);

        


    }

}