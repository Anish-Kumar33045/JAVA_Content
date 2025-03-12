// creating our own exception

class AnishException extends Exception
{
    public AnishException(String string){
          super(string); // helps to send our message in the AnishException
    }
} 

class Exception3 {
    public static void main(String[] args) {
        // int i = 0;
        // int i = 2;
        int i = 20;
        int j = 0;
        
          int nums[]= new int[5];
          



       try {  
        j = 18/i; 
        if(j==0)
                throw new AnishException("our Message if any "); //using our exception 
       } 


catch (AnishException e) { 
        System.out.println("Error 404 "+ e);
       }

                                
catch(Exception e){ 
    System.out.println("Something Wrong");
}
         
        System.out.println(j);

        System.out.println("Bye ");

        
    }
}