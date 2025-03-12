/*

//  class Throws{

//     public static void main(String[] args) {
        
//         // checks whether the class name is present or not .
//          try {  
//           Class.forName("Lamborgini");
//        } 


// catch (ClassNotFoundException e) { 
//         System.out.println("Not able to find the class ");
//        }
//     }
//  } 



 class A{
//     public void show(){
        
//          try {  
//           Class.forName("Lamborgini");
//        } 


// catch (ClassNotFoundException e) { 
//         System.out.println("Not able to find the class ");
//        }

//     }

 public void show() throws ClassNotFoundException
 {
        
          Class.forName("Lamborgini");
       
    }
 } 

    
//  class Throws{

//       static {
//         System.out.println("Class Loaded");
//       }
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show(); 
//     }
//     }
 class Throws 
 {

      static {
        System.out.println("Class Loaded");
      }
    public static void main(String[] args) throws ClassNotFoundException
    {
        A obj = new A();
        obj.show();  // we get error here on running without try and catch
    }                // so mention in method throws ClassNotFoundException
    }

    */

   class A{


 public void show() throws ClassNotFoundException
 {
        
          Class.forName("Lamborgini");
       
    }
 } 
 class Throws 
 {

      static {
        System.out.println("Class Loaded");
      }

    public static void main(String[] args)
      {
          A obj = new A();
         
        try {
        obj.show();    
        } 
        
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
 }
 
