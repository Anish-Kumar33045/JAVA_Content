// // class Human {
// //     String name ;   // these are public variables.
// //     int age ;
// // }


//  class Human{

//    private  String name ;    // these are the private and not accessible in other class.
//    private  int age  ;

//     public int getAge(){   // can use any name for getAge .use the effective and readable.
//      return age;
//      }


//   //  public void setAge(int a){          
//       //  age = a;
//     // age = age ; // this returns zero as the preference is given to local variable. 
   
//     //   Human obj1 = new Human();
//     //   obj1.age = age;               // this also returns zero

        
//    //  }

// public void setAge(int age , Human obj){     
// Human obj1 = obj ;        
// obj1.age = age ;          
// }           

// public String getName(){ 
//     return name; 
//    } 

//    public void setName(String n){   // since we are setting the values not retuning we use void here.
//     name = n;
//    }
// }


// class _encapsulation {

//     public static void main(String arg[]){
  
//       Human obj = new Human();
//       // obj.name = " Anish ";
//       // obj.age  =  19 ;          // since the variables are private . It cannot be declared .

//     obj.setName(" Kumar ");
//     // obj.setAge(19);
//     obj.setAge(19, obj );   // we pass age and obj here

//       System.out.println(  obj.getName() +  " : "  +  obj.getAge());

//     }
// }
 


class Human{

   private  String name ;    // these are the private and not accessible in other class.
   private  int age ;

    public int getAge() {   // can use any name for getAge .use the effective and readable.
     return age;
   }

public void setAge(int age ){

this.age = age ;

 /* 
"this" refers to the current object that is calling .( i.e obj.setAge is calling )
"this" helps to shorten the code as used here.
*/

}


public String getName(){
    return name;
   }

   public void setName(String n){   // since we are setting the values not retuning we use void here.
    name = n;
   }
}


class _encapsulation{

    public static void main(String arg[]){

      Human obj = new Human();
    //   obj.name = " Anish";
    //   obj.age  =  19 ;          // since the variables are private . It cannot be declared .

    System.out.println(  "before setting values  " + obj.getName()+ " : " + obj.getAge());
    obj.setName("Kumar");
    // obj.setAge(19);
    obj.setAge(19);   // we pass age and obj here

      System.out.println(  obj.getName()+ " : " + obj.getAge());

    }
}