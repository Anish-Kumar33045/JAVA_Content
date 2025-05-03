class Mobile{
  
    String brand ;
    int price ;
   static String name; // static is linked to all throught.
 
    public void show(){  // this helps to print easily as used below

        System.out.println(brand + " : " + name + " : " + price);
    }

// public static void show1(){

//     System.out.println(brand + " : " + price +" : " + name);  // we cannot use static variable in non static variable.
// }

public static void show1(Mobile obj){
    System.out.println(obj.brand + " : " + obj.price + " : " + obj.name); 
}
} // we made changes so that it works


class _stringmobile{

    public static void main(String arg[]){  // static is used , so that we can use easily   
     Mobile obj1 = new Mobile();
     obj1.brand = " Apple ";
     obj1.price =   25999;
     obj1.name  = "Smart phone ";

     Mobile obj2 = new Mobile();
     obj2.brand = " Samsung ";
     obj2.price =   24777 ;
     obj2.name  = "Smart phone";

//    Mobile.name = "phone"; // this changes to the static string in the above class mobile 

     obj1.show();
     System.out.println();
     obj2.show();

     Mobile.show1(obj1);   



    }
}