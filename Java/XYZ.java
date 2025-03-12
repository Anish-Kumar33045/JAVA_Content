/* DYNAMIC METHOD DISPATCH */

class A {
    public void show()
    {
        System.out.println(" in A show ");
    }
}

class B extends A
{
    public void show(){
        System.out.println(" in B show ");
    }
}

class C extends A
{
    public void show(){
        System.out.println(" in C show ");
    }
}

public class XYZ{
    public static void main(String[] args) {
        // A obj2 = new A();
        // obj2.show();


              A obj = new A();
              obj.show();        // supose address of link is 101
              
            obj = new B();       // address changes
            obj.show();          // supose address of link is 103
           
           obj = new C();      // all class extends A
            obj.show();

        // A obj1 = new B();
        // obj1.show();

        // System.out.println(" in main class ");
    }
}