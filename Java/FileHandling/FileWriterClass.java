
// Write File using
// writeString Method
import java.io.FileOutputStream;
import java.io.IOException;

// Write File using and writeString() Method
// public class FileWriterClass {
//     public static void main(String[] args) throws IOException {
//         // Data to be written in file
//         String text = "Welcome to GeeksforGeeks\nHappy Learning! Stay connected";
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.print("Enter the Path : ");
//         String path = br.readLine();
//         // Defining the file name of the file
//         Path fileName = Path.of(path);
//         /*
//          * Path is class from java.nio.file represents file or directory
//          * Path.of(path) is static method that creates path of object from given string path
//          * 
//          * suppose String path = "C:/example/file.txt"
//          * then fileName becomes refernce to file path "C:/example/file.txt" .
//          * it doesn't open the files or checks if it exists , it just holds the path 
//          * 
//          * imp : 
//          * String path is plain text , it doesn't give access to file operations like reading , writingetc..
//          * but Path filename = Path.of(path) converts plain string to Path object so that Java files can work with;
//          */
//         try {
//             Files.writeString(fileName, text);
//             // Reading the content of the file
//             String fileContent = Files.readString(fileName);
//             // Printing the content inside the file
//             System.out.println(fileContent);
//         } catch (IOException e) {
//             System.err.println("An error occurred: " + e.getMessage());
//         }
//     }
// }
// run command prompt if not here javac FileName.java then java FileName 
//
//==============================================================
//==============================================================
//
// using FileWriter class , suitable for small content files
// public class FileWriterClass {
//     public static void main(String[] args) {
//         // Data to be written in file
//         String text = "Welcome to GeeksforGeeks\nHappy Learning! by FileWriterClass prgm";
//         // Try block to check if exception occurs
//         try {
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             System.out.print("Enter the Path : ");
//             // Reading File name
//             String path = br.readLine();
//             // Create a FileWriter object
//             // to write in the file
//             FileWriter fWriter = new FileWriter(path);
//             // Writing into file
//             fWriter.write(text);
//             // Printing the contents of a file
//             System.out.println(text);
//             // Closing the file writing connection
//             fWriter.close();
//         } // Catch block to handle if exception occurs
//         catch (IOException e) {
//             // Print the exception
//             System.out.print(e.getMessage());
//         }
//     }
// }  
//==============================================================
//==============================================================
// Using Buffered Writer class
// public class FileWriterClass {
//     @SuppressWarnings("ConvertToTryWithResources")
//     public static void main(String[] args) {
//         // Data to be written in file
//         String text = "Welcome to GeeksforGeeks\nHappy Learning! by Buffered Writer class prgm";
//         // Try block to check if exception occurs
//         try {
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             System.out.print("Enter the Path : ");
//             // Reading File name
//             String path = br.readLine();
//             // Create a BufferedWriter object to write in the file
//             BufferedWriter f_Writer = new BufferedWriter(new FileWriter(path));
//             // Writing into file
//             f_Writer.write(text);
//             // Printing the contents of a file
//             System.out.println(text);
//             // Closing the file writing connection
//             f_Writer.close();
//         } // Catch block to handle if exception occurs
//         catch (IOException e) {
//             // Print the exception
//             System.out.print(e.getMessage());
//         }
//     }
// }
// BufferedWriter f_Writer = new BufferedWriter(new FileWriter(path)); ??
//========================================================
//==============================================================
//using FileOutputStream class
public class FileWriterClass {

    public static void main(String[] args) {
        // Data to be written in file
        String text = "Welcome to GeeksforGeeks\nHappy Learning! by FileOutputStreamClass prgm";

        // Try block to check if exception occurs
        try {
            // create object of FileOutputStream
            FileOutputStream outputStream = new FileOutputStream("demo.txt");

            // Store byte content from string
            byte[] strToBytes = text.getBytes();

            //write into file
            outputStream.write(strToBytes);

            System.out.println("file sucessfully created with content");
        } // Catch block to handle if exception occurs
        catch (IOException e) {
            // Print the exception
            System.out.print(e.getMessage());
        }
    }
}
