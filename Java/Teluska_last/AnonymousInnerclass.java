class A      
{
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
//   class B extends A
//     {
//         public void show()
//         {
//            System.out.println(" in B show ");
//         }
//     }



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
         A.B obj1 = obj.new B(); // 
         obj1.config();
/*
 * In this snippet:

A.B: Refers to class B defined within class A.

obj.new B(): Creates an instance of the inner class B associated with the instance obj of the outer class A.
 This syntax is necessary because non-static inner classes hold an implicit reference to their enclosing class instance.

obj1.config(): Calls the config() method of the inner class B.
 */
    }

}