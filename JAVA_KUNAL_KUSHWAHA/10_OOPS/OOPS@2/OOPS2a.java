



public class OOPS2a {

    public static class StaticBlock{
        static int a= 4;
        static int b;
    
        // will only run once when the first obj is create i.e when the class is loaded for the first time .

        static {
            System.out.println("Static block");
            b = a * 5 ;
        }
}
    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }

    


        static void message(){
            System.out.println("Message : Inbox");
            // System.out.println(this.age);  
            //error: this referes to an onject and cannot be written

        }
  

        

       
    }

    

