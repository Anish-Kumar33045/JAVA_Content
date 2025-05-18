
// Java Program to display all
// the contents of a directory
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllDir {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter directory path : ");
            String dirpath = br.readLine();

            System.out.print("Enter the directory name : ");
            String dname = br.readLine();

            File f = new File(dirpath, dname);

            if (f.exists() && f.isDirectory()) {
                String[] arr = f.list();

                if (arr != null) {
                    int n = arr.length;

                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                        File f1 = new File(f, arr[i]);

                        if (f1.isFile()) {
                            System.out.println(": is a file");
                        }
                        if (f1.isDirectory()) {
                            System.out.println(": is a directory");
                        }
                    }

                    System.out.println("\nNo of entries in this directory : " + n);
                } else {
                    System.out.println("Could not list contents or directory is empty.");
                }
            } else {
                System.out.println("Directory not found or is not a directory.");
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}


/*
dirpath — the parent directory path

dname — the name of a file or subdirectory inside that directory

 So:

Enter directory path : C:\Users\anish\OneDrive\Desktop\coding\JAVA_Content\Java
Enter the directory name : FileHandling

Then:

f will represent C:\Users\anish\OneDrive\Desktop\coding\JAVA_Content\Java\FileHandling

In short:
dirpath contains dname

dname is inside the directory dirpath

You're referring to a file or directory at that combined path


 */
