
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionClass {

    /*
     * 1. equals(Object FP_obj)
     * Syntax:
     * 
     * public boolean equals(Object FP_obj)
     * 
     * Parameters: FP_obj: the FilePermission object to be verified with this object
     * Returns: true: if both the objects are equal else, false.
     */
    // public static void main(String[] args) throws IOException {
    // boolean bool = false;
    // // Creating new FilePermissions("Path", "action")
    // FilePermission FP_obj1 = new FilePermission("GEEKS", "read");
    // FilePermission FP_obj2 = new FilePermission("ABC", "write");
    // FilePermission FP_obj3 = new FilePermission("GEEKS", "read");
    // // Use of equals method
    // bool = FP_obj2.equals(FP_obj1);
    // System.out.println("Whether FP_obj1 equals FP_obj2 : " + bool);
    // bool = FP_obj2.equals(FP_obj3);
    // System.out.println("Whether FP_obj2 equals FP_obj2 : " + bool);
    // bool = FP_obj1.equals(FP_obj3);
    // System.out.println("Whether FP_obj3 equals FP_obj1 : " + bool);
    // }
    // =====================================================================================================
    /*
     * 2. getActions()
     * Syntax:
     * 
     * public String getActions()
     * 
     * Returns: Canonical string: representing the actions associated with the
     * object
     */
    // public static void main(String[] args) throws IOException {
    // // Creating new FilePermissions
    // FilePermission FP_obj1 = new FilePermission("GEEKS", "read, delete, write");
    // FilePermission FP_obj2 = new FilePermission("ABC", "write, read, execute");
    // FilePermission FP_obj3 = new FilePermission("GEEKS", "delete, readlink,
    // read");
    // // Use of getActions() method
    // String str = FP_obj1.getActions();
    // System.out.println("Actions with FP_obj1 : " + str);
    // str = FP_obj2.getActions();
    // System.out.println("Actions with FP_obj2 : " + str);
    // str = FP_obj3.getActions();
    // System.out.println("Actions with FP_obj3 : " + str);
    // }
    // =====================================================================================================
    /*
     * 3. hashCode()
     * Syntax:
     * 
     * public int hashCode()
     * 
     * Returns: hash code value for the argumented object
     */
    // public static void main(String[] args) throws IOException {
    // // Creating new FilePermissions
    // FilePermission FP_obj1 = new FilePermission("GEEKS", "read, delete, write");
    // // Use of hashCode() method
    // int i = FP_obj1.hashCode();
    // System.out.println("hashCode value for FP_obj1 : " + i);
    // }
    // =====================================================================================================
    /*
     * 4. implies(Permission arg)
     * Syntax:
     * 
     * public boolean implies(Permission arg)
     * 
     * Parameters: arg: Permission to be checked
     * 
     * Returns true → if the current permission covers all the access rights of the
     * passed-in Permission object.
     * 
     * Returns false → otherwise.
     */
    // public static void main(String[] args) throws IOException {
    // // Creating new FilePermissions
    // FilePermission perm1 = new FilePermission("C:/docs/*", "read,write");
    // FilePermission perm2 = new FilePermission("C:/docs/report.txt", "read");
    // System.out.println(perm1.implies(perm2)); // true ✅
    // System.out.println(perm2.implies(perm1)); // false ❌
    // System.out.println(perm2.implies(perm2)); // true ✅
    // }
    // =====================================================================================================
    /*
     * 5. newPermissionCollection()
     * Syntax:
     * 
     * public PermissionCollection newPermissionCollection()
     * 
     * 
     * Parameters: arg: Permission to be checked
     * Returns: new PermissionCollection object having the FilePermission objects.
     */
    public static void main(String[] args) throws IOException {

        // Creating new FilePermissions
        FilePermission FP_obj1 = new FilePermission("GEEKS.txt", "read");

        // Creates a FilePermission object that allows reading the file GEEKS.txt.

        // Creating new PermissionCollection

        PermissionCollection FP = FP_obj1.newPermissionCollection();
        // Creates a collection (FP) to hold multiple Permission objects of the same
        // type (here, FilePermission )

        // newPermissionCollection() returns a new collection compatible with
        // FilePermission

        /*
         * // Method 2: Directly chaining without storing object
         * PermissionCollection FP = new FilePermission("GEEKS.txt",
         * "read").newPermissionCollection();
         * 
         */
        // Collecting the Permissions of FP_obj1 for FP
        FP.add(FP_obj1);
        boolean check = FP.implies(new FilePermission("GEEKS.txt", "read"));
        System.out.println("Is newPermissionCollection() working : " + check);
    }
}

/*
 * FP.implies(new FilePermission("GEEKS.txt", "read"));
 * or is valid FP.implies(FP_obj1);
 * 
 * 🧠 Why use new FilePermission(...) then?
 * Sometimes people write new FilePermission(...) to:
 * 
 * Test another path or action (e.g., write instead of read).
 * 
 * Avoid needing to define a variable if it's only used once.
 */