 class Inheritance{
    public static void main ( String arg[]){
    //    AdvCalc obj = new AdvCalc();
    VeryAdvCalc obj = new VeryAdvCalc();
       
       int r1 = obj.add   (4 , 5);
       int r2 = obj.sub   ( 7 ,4);
       int r3 = obj.multi ( 7 ,4);
       int r4 = obj.div   ( 16 ,4);
       double r5 = obj.power(4 ,2);
       System.out.println( r1 +"  " + r2 + " "+ r3 +" "+r4+" "+r5 );
    }
  } 

  /*
     Inheritance is used to the feature from the upper class
     Inheritance needs the class file and java file is not neccessary
     VeryAdvCalc extends AdvCalc , AdvCalc extends Calc ( multi level Inheritance )

AdvCalc extends Calc ( single level Inheritance )
VeryAdvCalc extends AdvCalc ( single level Inheritance )

for Ex --> C extends B and B extends A is allowed in java 
           C extends both A and B is not allowed in java ( multiple inheritance )
  */