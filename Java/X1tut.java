
class Laptop {

     String model ;
     int price ;


     public String toString()
     {                                    // comment the method and print toString.
        return model + " : " + price ;
     }


     public boolean equals (Laptop that)
     {
        if(this.model.equals(that.model) && this.price == that.price)
            return true ;
        else 
            return false;

     }


}

public class X1tut
{


    public static void main ( String arg[])
    {

        Laptop obj = new Laptop ( );
        obj.model = " lenevo ideapad ";
        obj.price = 58000;
        

Laptop obj1 = new Laptop ( );
        obj1.model = " lenevo yoga ";
        obj1.price = 88000;

boolean result = obj.equals(obj1);
System.out.println(result);

        System.out.println(obj);
        System.out.println(obj1);    
        
     
        // System.out.println(obj.toString());  //  toString() is called by default
    }
}

/*  
 public String toString() {
 
 return getClass().getName() + " @ " + Integer.toHexString( hashcode() ) ;

 }


*/