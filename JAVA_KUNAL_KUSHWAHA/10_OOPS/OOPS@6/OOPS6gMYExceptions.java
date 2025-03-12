public class OOPS6gMYExceptions {
    public static void main(String[] args) {
        try {
        String name = "Anish";
        if(name.equals("Anish")){
            throw new MyException("AnishKumar");
        }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this is finally block");
        }
        // mulitiple finally staements are not allowed in java 
        // one try block has one fnally max
        // you can try multiple try blocks 
        // try{
        /*
          try{
          // outer try block
          try{
          // inner try block
          } finally{
           // inner cleanup 
           }
          } fianally {
           // outer cleanup
           }
           
         */
    }
} 

class MyException extends Exception{
   public MyException(String message){
    super (message);
   }
}



/*
 
 */