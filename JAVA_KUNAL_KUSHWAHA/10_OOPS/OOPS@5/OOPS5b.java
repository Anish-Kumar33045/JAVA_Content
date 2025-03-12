interface Engine {
    static final int PRICE = 78000;
    void start();
    void stop();
    void acc();
}

interface Brake {
    void brake();
}

interface Media {
    void start();
    void stop();
}

class Car implements Engine, Brake, Media {
    @Override
    public void brake() { //methods must be declared with access modifiers
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I am accelerating");
    }
}
 /* earlier stoping the musicpayer would result in stoping entire car as they have same function 
 it is overcome by below steps

  *  in the above class car implements all the inteface 
    and start is common to both Media , Engine and therefore confusion
     so make class that extends only one inteface as shown below

  */


class CDplayer implements Media{
    @Override
   public void start(){
    System.out.println("Music start ...");
   }
 
   @Override
   public void stop(){
    System.out.println("Music stops!");
   }
}


 class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerating");
    }
 }
 class ElectricalEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electrical Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electrical engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Electrical Engine accelerating");
    }
 }



  class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();

   void Nicecar(Engine engine){
        this.engine=engine;
    }

    public void start(){
     engine.start();
    }
    public void stop(){
     engine.stop();
    }
   
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
     
    public void upgradeEngine(){
        this.engine = new ElectricalEngine();
    }
 }
 

public class OOPS5b {
    public static void main(String[] args) {
    // Engine car = new Car();
    //    Car car = new Car();
    //     car.acc();
    //     car.brake();
    //     car.start();
    //     car.stop();
    //     Media carmedia = new Car();
    //     carmedia.stop();
 

       NiceCar car = new NiceCar();
       car.start();
       car.startMusic();
       car.upgradeEngine();
       car.start();

        
    }
}