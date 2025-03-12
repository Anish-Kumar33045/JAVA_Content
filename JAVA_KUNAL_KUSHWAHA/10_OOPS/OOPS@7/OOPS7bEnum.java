


interface A{
    void hello();
}
public class OOPS7bEnum {
    /*
     * enum can't extend anything
     * it can't be superclass
     * it can implement 
     * abstracts are not allowed inside enum 
     * method body is must
     */
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thrusady,Friday,Saturday,Sunday; //theses are enum constants 
        // these are public ,static, final
        //since it is final child enums can't be created
        // type is Week here 
        
        //constructor
        Week(){
            System.out.println("Constructor called for"+this);
        }
        //this is not public or protected , only private or default
        // we dont want to create new objects to access all the days
        // internally : public static final week Monday = new Week();
        
        @Override
         public void hello(){
            System.out.println("hey how are you");
        }
    }

   
   public static void main(String[] args) {
    Week week ;
    week = Week.Monday;
    week.hello();
    System.out.println(Week.valueOf("Monday")); //return enum constant

   //System.out.println(week);//prints Monday
   //System.out.println(week.ordinal());// gives position of enum declaration

    for(Week day : Week.values()){
        //System.out.println(day);
    }

   } 
}
