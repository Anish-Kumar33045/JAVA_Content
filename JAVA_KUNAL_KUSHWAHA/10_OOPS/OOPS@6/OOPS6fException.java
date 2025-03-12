class OOPS6fException{
    public static void main(String[] args) {
        int a = 5;
        int b= 0;
        // int c = a/b ; // gives arithemetic exception
        // instead use try block

        //try block executes and followed by catched block in order 
        // if arithemeticexception block is not executed the exception block is executed 

        try {
            divide(a,b);
            int c = a/b;
            
        } catch (ArithmeticException e) { //Exception is class and it contains sub classes like arithmetic exception and so on 
            System.out.println(e.getMessage());
        }
        catch (Exception e) {  
            System.out.println("other than Arithmetic Exception");
        }

        finally{
            System.out.println("this is always execute ");
        }

      /*
        throw --> explicitly throw an exception
        inside the method or block of code
        syntax--> throw new Exceptiontype ("message");

        only single exception instance can be thrown at a time using throw

        throws -->
        declares the exception the method can throw 
        in the method signature
        syntax--> returnType methodName() throws ExceptionType
        indicates that the caller of the method is reponsible for handling or declaring the exception

       */


    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please don't divide by zero");
        }
        return a/b;
    }
      
    
}
/*
  Object --> main class
  Throwable --> 1)exceptions
                2)Errors ---> a) checked  --> compile time (ex file not found)
                              b) unchecked --> (ex: divide by zero arithemetic exception)
   
    
 */