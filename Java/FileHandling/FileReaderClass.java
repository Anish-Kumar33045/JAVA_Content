
import java.io.*;

/*
 * FileReader class in java.io package
 * used to stream of characters from files
 * 
 * 
 *  
 */
public class FileReaderClass {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("TEMP.txt");

            System.out.println("reading char by char : ");

            int i;
            // Using read method
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
            fr = new FileReader("TEMP.txt");
            System.out.println("\n\nreading using array[] : ");

            char[] charArr = new char[10];
            // using read method to get char array
            fr.read(charArr);
            System.out.print(charArr);

            //close method called
            fr.close();
            System.out.println("\n\nFile reader closed !");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
