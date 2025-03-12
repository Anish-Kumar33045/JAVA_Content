

public class Demo {

      int year;
      String name;
        
      public Demo(){
        System.out.println("default constructor");
      }

        public Demo(int year , String name){
         System.out.println("parameterised constructor");
         this.year = year;
         this.name = name;
   }

    public static void main(String[] args) {
        Demo obj1 = new Demo(); 
        System.out.println("year " + obj1.year + " Name "+obj1.name); 
        Demo obj = new Demo(2005, "phone");
        System.out.println("year " + obj.year + " Name "+obj.name); 
    }
}

/*
  Outerclass out = new Outerclass();
  Outerclass.Innerclass in = out.new Innerclass();
 */
