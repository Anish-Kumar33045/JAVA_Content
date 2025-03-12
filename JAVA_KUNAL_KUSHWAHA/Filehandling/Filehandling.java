
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/*
 * topic file handling
 *   stream 
 * types of stream --> nothing but abstract classes 
 * 1)byte stream --> handles i/o of binary data
 *  a) InputStream 
 *   b)OutputStream 
 * tip : any file ends with InputStream and OutStream is Byte Stream
 * 
 * 2)charstream ---> unicode 
 *   a) reader 
 *   b) writer 
 *  tip : any file ends with reader and writer then charStream                          
 *  
 *   I/O Exception
 *     Corrupt file, not able to read, file not found type error
 *   
 *   Predefined Streams in java
 *   System.out --> std os --> console
 *   System.in  --> std in --> keyboard
 *   System.err --> std err--> console
 * 
 */
public class Filehandling {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Anish");

        // try(InputStreamReader isr = new InputStreamReader(System.in)){
        //      System.out.println("Enter some letters:");
        //      int letters = isr.read();
        //      while(isr.ready()){
        //         System.out.println((char)letters);
        //         letters = isr.read();
        //      }
        //      isr.close();
        // }
        // catch(IOException e){
        //     S ystem.out.println(e.getMessage());
        // }


    //     try(FileReader fl = new FileReader("Note.txt")){
            
    //         int letters = fl.read(); // since read returns int we use so 
    //         while(fl.ready()){
    //            System.out.println((char)letters);
    //            letters = fl.read();
    //         }
    //         fl.close();
    //         System.out.println();
    //    }
    //    catch(IOException e){
    //        System.out.println(e.getMessage());
    //    }
        
            // try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){ // byte to char stream and then reading char stream
            //     System.out.println("YOu typed :" + br.readLine());
            // }
            // catch(IOException e){
            //     System.out.println(e.getMessage());
            // }
             
            try( BufferedReader br =  new BufferedReader(new FileReader("Note.txt"))){ // byte to char stream and then reading char stream
                while(br.ready()){
                    System.out.println(( br.readLine()));
                }
                System.out.println("You typed :" + br.readLine());
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }

            //output

            OutputStream os = System.out;
            os.write(45);
            System.out.println();

            // try(OutputStreamWriter osw = new OutputStreamWriter(System.out) ){
            //    osw.write("hello Anish");
            //    osw.write(97);
            //    osw.write('a');
            //    char[] arr = "hello World ".toCharArray();
            //    osw.write(arr);
            //    osw.write("Hi");
            // //    osw.write(😊); // gives error
            // }
            // catch(IOException e){
            //     System.out.println(e.getMessage());
            // }
             
           //changes in Note.txt file can be observed 


        //     try(FileWriter fw = new FileWriter("Note.txt",true) ){ // write true so that it append snot overrides the content in Note.txt
        //         fw.write("this should be append");
               
        //      }
        //      catch(IOException e){
        //          System.out.println(e.getMessage());
        //      }

        //  try(BufferedWriter bw = new BufferedWriter(new FileWriter("Note.txt"))){
        //     bw.write("Hare Krishna");
        //  }
        //  catch (IOException e){
        //     System.out.println(e.getMessage());
        //  }
         
         
          //create
         try {
             File fo = new File("new-file.txt");
             fo.createNewFile();//automatically creates new file
         } 
         catch (IOException e) {
            System.out.println(e.getMessage());
         }

         //write in file
         try {
             FileWriter fw = new FileWriter("new-file.txt");
             fw.write("ಭಗವದ್ಗೀತೆ\r\n"); //writes in new-file.txt
             fw.close(); 
         } catch (IOException e) {
            System.out.println(e.getMessage());
         }
          
         //read from file
         // Filereader or Buffererd as above 
         try( BufferedReader br =  new BufferedReader(new FileReader("new-file.txt"))){ // byte to char stream and then reading char stream
            while(br.ready()){
                System.out.println(( br.readLine()));
            }
            System.out.println("You typed :" + br.readLine());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try {
            File fo = new File("random.txt");
            fo.createNewFile();//automatically creates new file
            // deletes file just created
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        } 
        catch (IOException e) {
           System.out.println(e.getMessage());
        }

    }    
}
