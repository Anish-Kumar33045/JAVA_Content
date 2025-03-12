



class ExceptionHandling {
    public static void main(String[] args) {
        // int i = 0;
        int i = 2;

        int j = 0;
        
        // j = 18/i;
             // this gives Arimetic exception
        // run time error occurs and execution of program stops
        // so the rest of code is not executed as in case printing "Bye ".
       
       // inorder to handle the exception we follow as 


          int nums[]= new int[5];
          String str = null;

       try {  // try just tries to solve 
        j = 18/i; // when it is not runned after try then it goes outside the try block
                  // without executing the below codes.
        System.out.println(str.length());
        System.out.println(nums[1]);
        System.out.println(nums[5]); // going out of array nums
       } 

    //    catch (Exception e) { // catch block is executed only when there is need of exception. Otherwise it is skipped


    //     System.out.println("Something went wrong .."+ e);
    //    }

catch (ArithmeticException e) { 


        System.out.println("cannot divide by zero "+ e);
       }

// try {  

//         System.out.println(nums[5]);   //we can mention multiple try blocks and catch blocks .
//        }                                


catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Stay in your Limit ");
}


catch(Exception e){ // Exception class handles all the exceptions ..
                    // it is safe to mention at last to avoid the exceptions
    System.out.println("Something Wrong");
}
         
        System.out.println(j);

        System.out.println("Bye ");

        // even error the execution occurring ..
    }
}