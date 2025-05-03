
// Write File using
// writeString Method
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;



// Write File using and writeString Method

public class FileWriterClass
{
    public static void main(String[] args)
         throws IOException 
    {
        
        // Data to be written in file
        String text = "Welcome to GeeksforGeeks\nHappy Learning!";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");
        String path = br.readLine();

        // Defining the file name of the file
        Path fileName = Path.of(path);

        try {
            Files.writeString(fileName, text);

            // Reading the content of the file
            String fileContent = Files.readString(fileName);

            // Printing the content inside the file
            System.out.println(fileContent);
        } 
      	catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}


// public class FileWriterClass 
// {
//     public static void main(String[] args)
//     {

//         // Data to be written in file
//         String text = "Welcome to GeeksforGeeks\nHappy Learning!";

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
//         }

//         // Catch block to handle if exception occurs
//         catch (IOException e) {

//             // Print the exception
//             System.out.print(e.getMessage());
//         }
//     }
// }


