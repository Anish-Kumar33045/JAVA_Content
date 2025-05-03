

// // class A
// class A extends Object // every is class in JAVA extends OBJECT Class even if not mentioned .
// { 
 
//  public A(){
//     super();
//     System.out.println(" in A ");
//  }
 
//  public A(int n){
//     super();      // what is super class of A here
//     System.out.println(" in A int ");
//  }
// }

 
//   //  A ---> super class
  
//   //  B --->  sub class

//   //  by default there is the " super( ) " in all the constructors
//   //  the super() calls the super class of the constructor 
//   //  so it executes then the sub constructor is executed
   

// // class B 
// class B extends A 
// {
     
//     public B(){        // we created the constructor B 
//          //  super();
//          System.out.println(" in B ");
//     }

//       public B(int n){
//       //   super();  // this is default even if not mentioned for all
//         super(n);
//         System.out.println("in B int");
//       }
// }



// class _this_super{
//     public static void main(String[] args) {
        
//         B obj1 = new B ();
//          B obj = new B (5);
//     }
// }





// class A
class A extends Object // every is class in JAVA extends OBJECT Class even if not mentioned .
{ 
 
 public A() {
     
    super();
    System.out.println(" in A ");

 }
 
 public A(int n){
    super();      // what is super class of A here
    System.out.println(" in A int ");
 }
}

/* 
   A ---> super class
  
   B --->  sub class

   */

class B extends A
{
     
    public B(){        // we created the constructor B 
          super();
         System.out.println(" in B ");
    }

      public B(int n){
        this();  // " this() " keyword will execute the constructor for same class ..
      //   super(n);
        System.out.println("in B int");
      }
}



class _this_super{
    public static void main(String[] args) {
        
        B obj1 = new B ();
         B obj = new B(5);
    }
}