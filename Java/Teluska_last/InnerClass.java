

// class inside the class 

 class A       // outer can't be static --> if so then error occurs. 
{
      int age ;

      public void show()
      {
         System.out.println(" in A  show ");
      }

       class B 
    {
        public void config()
        {
           System.out.println(" in B config ");
        }
    }

}



public class InnerClass{
    public static void main (String arg[]){
           
         A obj = new A();
         obj.show();
         

         B obj1 = new B();
        //  A.B obj1 = obj.new B();
         obj1.config();


    }

}