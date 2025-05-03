// Create New file using File Class

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

// public class FileCreation {
  
//     // Function To Make New File
//     public void newFile()
//     {
//         String strPath , strName ;

//         // Try-catch Block
//         try {

//             // Creating BufferedReadered object
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             System.out.print("Enter the file name : ");

//             // Reading File name
//             strName = br.readLine();
//             System.out.print("Enter the file path : ");

//             // Reading File Path
//             strPath = br.readLine();

//             // Creating File Object
//             File file1 = new File(strPath + "\\" + strName + ".txt");

//             // Method createNewFile() method creates blank
//             // file.
//             file1.createNewFile();
//         }

//         // Try-Catch Block
//         catch (Exception ex1) {
//             System.out.print("Failed to create a file.");
//         }
//     }
  
//     public static void main(String args[]){
      
//         // Creating New File via function
//          FileCreation gfg = new FileCreation();
//         gfg.newFile();
//     }
// }

// Java Program to create new file
// using FileOutputStream class

public class FileCreation {

    // Function To Create A New File
    public void newFile()
    {
        String strFilePath , strFileName ;

        // Try-Catch Block
        try {

            // Creating BufferClass Object
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // Asking user for File Name
            System.out.print("Enter the file name : ");
            strFileName = br.readLine();
            
            // Asking File path from User
            System.out.print("Enter the file path : ");
            strFilePath = br.readLine();

            // Creating Object of FileOutputStream Class
            FileOutputStream fos = new FileOutputStream(
                strFilePath + "" + strFileName + ".txt");

        } catch (Exception ex1) {
            System.out.println("Exception Occurred");
        }
    }

    public static void main(String args[])
    {
        // Creating File Object
        FileCreation gfg = new FileCreation();
        gfg.newFile();
    }
}