/* 

            object
              | 
           throwable
              |
 1) Error          2) Exception (can be handled )
      |                          | 
 ThreadDeath            Runtime Exception  and (SQL,IO,manymore)
 IOerror                 (Unchecked exception)     // rest of exception other than runtime exeception are                      
VirtualMachineError        Arithematic                 // unchecked exeception
                           ArrayIndex             
                            NullPoint
                             etc..

*/

class Exception2 {
    public static void main(String[] args) {
        // int i = 0;
        // int i = 2;
        int i = 20;
        int j = 0;
        
          int nums[]= new int[5];
          

       try {  
        j = 18/i; 
        if(j==0)
                throw new ArithmeticException("Message can be sent here also");  
       } 


catch (ArithmeticException e) { 
        System.out.println("Error 404 "+ e);
       }

                                
catch(Exception e){ 
    System.out.println("Something Wrong");
}
         
        System.out.println(j);

        System.out.println("Bye ");

        
    }
}