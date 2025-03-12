
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// class Exception4{
//     public static void main(String[] args) {
        
//         // int a = 0;
//         int a = 2;
//         int b = 0;


//         try {     // used to try the method
//             b=18/a;
//             System.out.println("Bye.. in try block");
//         } catch (Exception e) {  // used to handle the exception 

//             System.out.println("Something Went Wrong ..");
//             System.out.println("Bye.. in Catch block");
//         }
//         /*
//               if there is exception in the try block then 
//               catch block is executed without excuting the "Bye.." in try block 
//               but "Bye .. " in catch block is excuted .

//         */

//         finally    
//         {

//              System.out.print("Bye .. in final block ");
//              // finally block is excuted even there is exception in the try block .
//              // finally is also used to close the resource ..

        
//         }
       


//     }
// }


/*

class Exception4{
    public static void main(String[] args)  throws NumberFormatException , IOException
     {
        
        int num = 0;
        BufferedReader bf = null ; // we declared outside so that we can use in final block as well .


        try {    
               InputStreamReader in = new InputStreamReader(System.in);
                bf = new BufferedReader(in);
                 num = Integer.parseInt(bf.readLine());
                 
                 System.out.println(num);
                
       
        } 
        
        

        finally    
        {

             System.out.print("Bye .. in final block ");
              bf.close();  // final block used to close the resource .
        
        }
       


    }
}
*/

class Exception4{
    public static void main(String[] args)  throws NumberFormatException , IOException
     {
        
        int num = 0;
        

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
        {    
               // we don't even need final block to close the buffer 
               // bf object is closed automatically
                
                 num = Integer.parseInt(bf.readLine());
                 
                 System.out.println("num is "+ num);
                
       
        } 
        
        

        


    }
}