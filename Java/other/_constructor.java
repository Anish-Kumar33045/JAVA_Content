

class Human {
   private  String name ;    // these are the private and not accessible in other class.
   private  int age ;

     public Human(){                              // default constructor
      System.out.println(" in constructor "); 
      age = 17 ;
       name = " Amruth " ;
       /* we can set the default values of age and name instead 
       setting it default zero by the help of constructor .*/ 
       
      /* constructor should have same name as the class Human ,
          constructor don't return any value . */

     }

    //  public Human(int a , String n ){   // parametrised constructor
    //  age = a;
    //  name = n;
    //  }

    public Human(int age , String name ){   // parametrised constructor
      System.out.println(" in paramerised constructor "); 
     this.age = age;
     this.name = name;  // we can " this. " also
     }
// this specifies the current object .
       
    public int getAge(){   // can use any name for getAge .Use the effective and readable.
     return age ;
   }
             
public void setAge(int age ){

this.age = age ;

 /* 
"this" refers to the current object that is calling .( i.e obj.setAge is calling )
"this" helps to shorten the code as used here .
*/

}


public String getName(){
    return name;
   }

   public void setName(String n){   // since we are setting the values not retuning we use void here.
    name = n;
   }
}


class _constructor {

    public static void main(String arg[]){

       Human obj = new Human();
      //Human obj1 = new Human(); // constructor gets called very time when the object is called.

    System.out.println(  " before setting values  " + obj.getName()+ " : " + obj.getAge()); // default constructor
         obj.setName("Kumar");
    
         obj.setAge(19);   

      System.out.println( "after setting values " + obj.getName()+ " : " + obj.getAge());

      Human obj1 = new Human(20 , "Nitesh");
       
       System.out.println(  obj1.getName()+ " : " + obj1.getAge());

    }
}