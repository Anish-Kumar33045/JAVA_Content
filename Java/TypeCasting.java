
class A {

public void show1()
{
    System.out.println(" in a A show ");
}

}

class B extends A 
{

public void show2()
{
    System.out.println(" in a B show ");
}

}

class TypeCasting {
    public static void main(String[] args) {

        A obj = (A) new B();  //  upcasting
        // A obj = new B(); 
        obj.show1();

        B obj1 = (B) obj;    // downcasting 
        obj1.show2();
        
    }
}