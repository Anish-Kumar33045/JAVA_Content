abstract class A {

    public void show()
    {
        System.out.println(" in A show ");
    }
}

class B extends A {
public void show()
    {
        System.out.println(" in B show ");
    }
    
}

class UseInnerclass{

    public static void main(String[] args) {
        // A obj = new A();   // gives error since A is abstract class .
           
           
            // A obj = new B(); 
            // obj.show();

            A obj = new A()        // using anonymous class for abstract as well .
            {
                public void show()
              {
                    System.out.println(" in new show ");
                 }
               
            };
                 obj.show();

    }
}