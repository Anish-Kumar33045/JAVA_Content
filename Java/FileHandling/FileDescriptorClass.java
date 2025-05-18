import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 🔹 Purpose of the Program:
 * This Java program:
 * 
 * Creates a file FILE.txt
 * 
 * Writes the word GEEKS into it as bytes
 * 
 * Uses a FileDescriptor to synchronize the file with the disk using sync()
 */
// ```

public class FileDescriptorClass {
    // public static void main(String[] args) throws IOException {
    // // Initializing a FileDescriptor
    // FileDescriptor geek_descriptor = null;
    // FileOutputStream geek_out = null;

    // // HERE I'm writing "GEEKS" in my file
    // byte[] buffer = { 71, 69, 69, 75, 83 }; // ASCII for G E E K S

    // try {
    // geek_out = new FileOutputStream("FILE.txt"); // Opens (or creates) a file
    // named FILE.txt for writing.
    // // FileOutputStream class is used to write data to a file in the form of
    // bytes

    // // This getFD() method is called before closing the output stream
    // geek_descriptor = geek_out.getFD();
    // // getFD() gets the underlying FileDescriptor object from the
    // FileOutputStream.

    // System.out.print("File Descriptor ( geek_descriptor ) : " + geek_descriptor +
    // "\n");

    // geek_out.write(buffer); // Writes GEEKS into the file.

    // geek_descriptor.sync();
    // // sync() forces all system buffers to be written to the disk.
    // // Ensures the data is actually saved (important for critical applications).
    // System.out.print("\nUse of Sync Successful ");

    // } catch (Exception except) {
    // // if in case IO error occurs
    // except.printStackTrace();
    // } finally {
    // // releases system resources
    // if (geek_out != null)
    // geek_out.close();
    // }
    // }
    // }```
    /*
     * 🧠 Why Use FileDescriptor?
     * It's used when you want low-level control over file I/O.
     * 
     * .sync() is more reliable than just .close() when you need to ensure data is
     * saved to disk (like in databases or logs).
     * 
     * ✅ Simple Explanation:
     * getFD() is a method that returns the FileDescriptor associated with the file
     * output stream (geek_out).
     * 
     * So geek_descriptor becomes a handle (pointer) to the actual file at the OS
     * level.
     */

    /*
     * 2. valid() Method
     * java.io.File.valid() checks whether the FileDescriptor object is valid or
     * not.
     * 
     * Syntax:
     * 
     * public boolean valid()
     * 
     * Return true if the FileDescriptor object is valid else, false
     */

    public static void main(String[] args) throws IOException {
        // Initializing a FileDescriptor
        FileDescriptor geek_descriptor = null;
        FileInputStream geek_in = null;

        // FileInputStream is used to read from the file.

        // FileDescriptor is a handle to the actual OS-level file.
        try {
            geek_in = new FileInputStream("FILE.txt"); // Opens FILE.txt for reading.

            // get file descriptor
            geek_descriptor = geek_in.getFD();

            boolean check = false;

            // Use of valid() : checking the validity of FileDescriptor
            check = geek_descriptor.valid();
            /*
             * Returns true if:
             * 
             * The file descriptor is connected to an actual file/device.
             * 
             * The stream has not been closed yet.
             * 
             * Returns false if the descriptor is invalid (e.g., stream is closed or not
             * connected).
             * 
             */
            System.out.print("FileDescriptor is valid : " + check);

        } catch (Exception except) {
            // if in case IO error occurs
            except.printStackTrace();
        } finally {
            // releases system resources
            if (geek_in != null)
                geek_in.close();
        }
    }
}