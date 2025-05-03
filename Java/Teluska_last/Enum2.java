enum Laptop 
{
  Macbook(2000), XPS(2200) , Surface(1500) , ThinkPad(1800) ;

     private int price ;

     private Laptop(int price)   // parameterized constructor 
     {
        this.price = price ;
     }

     public int getPrice()
     {
       return price ;
     }

     public void setPrice(int price)
     {
        this.price = price;
     }

     
}


public class Enum2{

    public static void main(String[] args) {

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());
        
        // Laptop.Macbook.setPrice(2500);  //or
        lap.setPrice(2500);
        System.out.println("Updated price of " + lap + " : " + lap.getPrice());

        
        System.out.println("All laptops and their prices:");

        for(Laptop laptop : Laptop.values())
        {
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}