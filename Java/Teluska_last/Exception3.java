// creating our own exception

class AnishException extends Exception
{
    public AnishException(String string){
          super(string); // helps to send our message in the AnishException
    }
} 

class Exception3 {
    public static void main(String[] args) {
        int i = 0;
        // int i = 2;
        // int i = 20;
        int j = 0;
        
        int nums[] = new int[5];
          
       try {  
        j = 18/i; 
        if(j==0)
                throw new AnishException("This is a custom exception"); //using our custom exception 
       } 

/*
 * What super(string) does:
It calls the constructor of the parent class, which is Exception.

Exception has a constructor that accepts a String message.

So super(string) passes your custom message (like "Something went wrong") to the Exception class.

This message can later be retrieved using getMessage() method.
 */

catch (AnishException e) { 
        System.out.println("Error 404 "+ e);  // Output: This is a custom exception
       }

                 
       // if other exception occurs then it will be caught by this block

catch(Exception e){ 
    System.out.println("Something Wrong");
}
         
        System.out.println(j);

        System.out.println("Bye ");

        
    }
}