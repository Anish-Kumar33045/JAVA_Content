 


/*
 * package --> defination 
 * 
 * 
 */
 

public class OOPS2 {

    // int age;
    // String name;
    // int salary;
    // boolean married;

    // public OOPS2(int age ,String name , int slary , boolean married ){
    //     this.age=age;
    //     this.name=name;
    //     this.salary=salary;
    //     this.married = married;
    // }
    public static void main(String[] args) {
    
    //     A obj = new A();
    //   System.out.println(obj);
         Human anish = new Human(19, " Anish Kumar ",2400000,false);
         Human amruth = new Human(17, " Amruth Raj ",2400000,false);
         Human nitesh = new Human(20, "nitesh ", 2400000,false);

        //  System.out.println(anish.population);
        //  System.out.println(amruth.population);
        // use class name here Human to access 
        //  System.out.println(Human.population);
        //  System.out.println(Human.population);
        //  System.out.println(Human.population);

       // fun(); // can be called directly

        // greet(); // nonstatic inside static is not possible 

        // OOPS2 obj = new OOPS2();
        // obj.greet(); 
        // by the help of object the nonstatic method can be called
         
        OOPS2 obj2 = new OOPS2();
        obj2.fun2(); 
          
    } 
        // non static method
       void greet(){
        System.out.println("GREET ");
        fun(); // static can be called directly inside nonstatic method 
       }
            
       //static method
        static void fun(){
          System.out.println("FUN");
          // greet(); // nonstatic inside static is not possible 
        }
        
        // fun2() is nonstatic and greet() also
        // if the fun2() is called with help of object then greet() is also 
        // called along with it (here obj2 in main fn)
          void fun2(){
            System.out.println("FUN2");
            greet();
         }

     public static class Human {
       int age;
       String name;
       int salary;
       boolean married;
        // long population ;// run then individual count is got 

       static long population ;

      // constructor 
      Human (int age ,String name , int salary , boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        
        // this.population+=1;
        Human.population+=1;
        /*
         *  both the static and class name Human works 
         * but it is bettter to use the class name 
         * as it is static it is common to all 
         * while accessing , modifying, declaring try to use class name only (it's convention)
         * 
         *  when a member is declared static it ca be accessed before the any of the 
         *  object of class is created and without referencing to that object
         * 
         *  can be used without creating the object (independent)
         * static variables , methods 
         * 
         * (static) common thing--> psvm (main function)
         *  
         *  
         */
    }

    }
     

}

