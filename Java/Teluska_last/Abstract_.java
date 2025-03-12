abstract class car {

public abstract void drive();
// abstract donot have body 
// it should be declared in abstract class itself .
// we cannot create object of abstract car 

// abstract class may have abstract method or may not or both as well .

public void playMusic(){
    System.out.println(" playing Music ... ");
}
}

   class WagonR extends car

{
       public void drive(){
        System.out.println("Driving ..");
       }
}

class Abstract_{
    public static void main(String[] args) {
        // car obj = new car();  // gives error as mentioned above .
        car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}