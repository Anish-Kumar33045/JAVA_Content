
/*
 * file deleted using java program are permanently deleted without being moved to trash/recycle bin.
 * 
 * methods :
 * 1) java.io.File.delete() method
 * 2) java.nio.file.files.deleteifexists(Path p) method
 */
// public class Filedeletion {
//     public static void main(String[] args) throws IOException {
//         // using  java.io.File.delete() method :
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter path : ");
//         String path = br.readLine();
//         File file = new File(path);
//         if (file.delete()) {
//             System.out.println("File deleted successfully");
//         } else {
//             System.out.println("delete operation failed !");
//         }
//     }
// }
// =================================================================================================
//2) using java.nio.file.files.deleteifexists(Path p) method

/*
 * deletes files if exists 
 * deletes directory mentioned in path obly if directory is empty
 * 
 * parameters : path - path to the file to delete
 * returns : true = if file deleted by this method
 *            false = if couldn't delete as it doesn't exists.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Filedeletion {

    public static void main(String[] args) {
        //scanning for file path
        Scanner sc = new Scanner(System.in);

        try {
            String str;
            System.out.println("Enter file / directory path");
            str = sc.nextLine();
            Files.deleteIfExists(Paths.get(str));
        } catch (NoSuchFileException e) {
            System.out.println("No such file / directory exists");
        } catch (IOException e) {
            System.out.println("Invalid permissions");
        }

        System.out.println("deleted successfully");

    }
}
