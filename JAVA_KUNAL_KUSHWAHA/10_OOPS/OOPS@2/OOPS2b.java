/* 
 *  now the inner is dependent on itself 
 *  so no static variable is not required 
 * 
 */

//  class Test{
//    static String name;       // without static here gives error 
//   public Test(String name){
//     //   this.name = name; // this or class name is same , but convienent is class name
//     //   Test.name = name;
//   }
// } 

   public class OOPS2b {
   /*
    *  outer class --> OOPS2b 
       inner class --> Innerclass
        
       the inner class is dependent the outer class 
       without mentioning static in Inner class gives error 

       when it the innerclass is static it is independent of outerclass objects 

    */

     // this is declared as static so it is not dependent on the objects of outerclass
    //  but the main and test can depend on each right ??

      static class Test{
        String name;
          public Test(String name){
          this.name = name;
      }
    } 

   // calling two times Amruth is is dependent on String name Whether it is static or not 
    // static class Test{
    //     static String name;
    //       public Test(String name){
    //       this.name = name;
    //   }
    // } 


    public static void main(String[] args) {
        
        Test a = new Test("Anish");
        Test b = new Test("Amruth");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
