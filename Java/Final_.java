// final can be used with variable , method , class .

// final class A         // no one can use the class
         class A 
{

    // public void show()
    // public final void show()
//     {
// System.out.println("in A show ");
//     }


 public void show()
        {
        System.out.println(" by Anish");
    } 

    
    public void add (int a, int b){
        System.out.println(a+b);

       
    }
  }

  class AdvanceA extends A
   {
    public void show(){
        System.out.println(" by JOhn");
    }
     }

    public class Final_{
    public static void main(String[] args) {
        
        // int num = 8 ;
        // final int num = 8 ; // the varible gets the fixed value.
        //   num = 9;
        // System.out.println(num);

         AdvanceA obj = new AdvanceA();
        //  A obj = new A();
         obj.show();
        obj.add(4,5);
     }
 }