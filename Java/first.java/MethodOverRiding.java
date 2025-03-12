
class A{

public void show(){
    System.out.println(" in A show ");

}

public void config(){
    System.out.println(" in A config ");
  }
}

// class B 
class B extends A
{
    public void show(){                   // this method over writing above show() method .
    System.out.println(" in B show ");
  }
}


class MethodOverRiding {

    public static void main(String[] args) {
    //   A obj = new A();            // gives " in A show " 
         B obj = new B();           // gives " in B show "
        obj.show();
        obj.config();     
    }
}