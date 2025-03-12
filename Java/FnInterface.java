 @FunctionalInterface   //by doing this we make sure that we have one method
 interface A 
 {
    void show();
    // void run();
 }


class B implements A 
{ 
    public void show(){
    System.out.println("in B show ");
    }
}
                                      
 public class FnInterface 
 {
    public static void main(String[] args)
     {
      // A obj = new A(); // can't create A() since interface A
      // so we create the class B which implements A


      // A obj = new B();
      // obj.show();   

    // we can create by the another method 
    // by using anonymous in the class 

        //  A obj = new A()
        //  {
        //       public void show()
        //       {
        //         System.out.println("in new show ");
        //       }
        //  }; // ; is important 
        //       obj.show();

        //  A obj = () -> //lambda shortcut of above method 
        //       {
        //         System.out.println("in Show new");
        //       };     // ; is important 

        // the curly brackets can be removed if it is single statement

        // A obj = () -> System.out.println("in Show new");
             
        //  obj.show();

        // if we want to pass values or parameters then 

       /* 
       
          A obj = (int i) -> System.out.println(" in new show ");
             
            obj.show(5) ;

         */


    }
 }


 /* types of interfaces 
     1) Normal  interface
     interface Abc 
     {
           ------
           ------  // multilines
     }



     2) functional / SAM (Single Abstract Method) interface
        interface Abc
        {
          ------- // single line
        }
     
     3) Marker interface
         interface Abc 
         {
           // blank interface 
         }


 exceptions 
 compile time error 
 run time error ---> exception handling 
 logical error 


 */