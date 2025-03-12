class A      
{
      public void show()
      {
         System.out.println(" in A  show ");
      }

    //    class B 
    // {
    //     public void config()
    //     {
    //        System.out.println(" in B config ");
    //     }
    // }

}
  class B extends A
    {
        public void show()
        {
           System.out.println(" in B show ");
        }
    }



public class AnonymousInnerclass{
    public static void main (String arg[]){
           
        //  A obj = new A();       // gives A show
        //  obj.show();

        //   A obj = new B();         // gives B show 
        //  obj.show();
         
         A obj = new A()
         {
                public void show()
                {
                    System.out.println("in new Show ");
                }
         };       
         obj.show();     // this is inner class and it created inside main class 
                         // this class donot have name ,it can be seen as here as AnonymousInnerclass$1 like that .

                         
        //  B obj1 = new B();
        // //  A.B obj1 = obj.new B();
        //  obj1.config();


    }

}