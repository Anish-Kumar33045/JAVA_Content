import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// class Exception4{
//     public static void main(String[] args) {
        
//         int a = 0;
//         // int a = 2;
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



// class Exception4{
//     public static void main(String[] args)  throws NumberFormatException , IOException
//      {
        
//         int num = 0;
//         BufferedReader bf = null ; // we declared outside so that we can use in final block as well .


//         try {    
//                InputStreamReader in = new InputStreamReader(System.in);
//                bf = new BufferedReader(in);
//                 /*
//                  * BufferedReader is used to read the input from the user.
//                  * InputStreamReader is used to convert the byte stream into character stream.
//                  * 
//                     🔹 1. System.in
//                  * This is the standard input stream (keyboard).

//                  * But it's a byte stream, meaning it reads raw bytes — not suitable for reading text directly.

//                     🔹 2. InputStreamReader in = new InputStreamReader(System.in);
//                  * InputStreamReader is a bridge between byte streams and character streams.

//                  * It takes System.in (bytes) and converts it into characters so it can read text properly.

//                     🔹 3. bf = new BufferedReader(in);
//                  * BufferedReader wraps the InputStreamReader to make reading faster and easier.

//                  * It provides the method readLine(), which reads an entire line of text at once.
//                  */
//                  num = Integer.parseInt(bf.readLine());
//                  /*
//                   * bf.readLine() waits for the user to type something and press Enter.

//                   * Integer.parseInt() converts that string into an integer.

//                   * If the input is not a valid number, it will throw NumberFormatException.
//                   */
//                  System.out.println(num);
                
       
//         } 
//         catch (NumberFormatException e) {  // used to handle the exception 

//             System.out.println("Something Went Wrong ..");
//             System.out.println("Bye.. in Catch block");
//         }
//         catch (IOException e) {  // used to handle the exception 

//             System.out.println("Something Went Wrong ..");
//             System.out.println("Bye.. in Catch block");
//         }
//        finally {
//         System.out.print("Bye .. in final block ");
//             try {
//                 if (bf != null) {
//                     bf.close(); // always close to avoid memory leaks
//                 }
//             } catch (IOException e) {
//                 System.out.println("Error closing reader: " + e.getMessage());
//             }
//         }


//     }
// }



// class Exception4{
//     public static void main(String[] args)  throws NumberFormatException , IOException
//      {
//         int num = 0;
        
//         try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
//         {    
//                // we don't even need final block to close the buffer 
//                // bf object is closed automatically
                
//                  num = Integer.parseInt(bf.readLine());
                 
//                  System.out.println("num is "+ num);
      
//         } 
   
//     }
// }