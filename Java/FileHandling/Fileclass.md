# file class

Java File Class
The File class in Java is used to represent files or directories in the file system.

Key Points:

- It represents a file or folder path (not the file content).

- Works with absolute or relative paths.

- Use getParent() to get the parent directory.

- To use it, create a File object by passing a file or folder name:

File file = new File("example.txt");

You can check or do operations like:

- Create or delete files/directories

- Rename files

- List contents of a directory

- Check file properties (like readable, writable, etc.)

Important Notes:
The File object is immutable — once created, its path can’t be changed.

\* this means :
File file1 = new File("example.txt"); // points to example.txt
The file object remembers the path "example.txt". After that:

You cannot change this file object to point to a different file like "test.txt" using the same object.

If you want to refer to another file, you have to create a new File object.

File file1 = new File("example.txt"); // points to example.txt
File file2 = new File("test.txt"); // points to test.txt

Each object sticks to the file or folder path it was created with. That’s what immutable means here—it cannot be changed later. \*

Actual file actions depend on permissions (read/write/execute) set by the system.

# Why use File class?

Different operating systems (Windows, Linux, Mac) use different formats for file paths. So instead of using simple strings, Java uses the File class to manage file and folder paths in a reliable way.

# Features of File Class:

It represents file or folder paths, not the file's content.

=) Paths can be:

- Absolute: full path (e.g., C:/Users/abc/file.txt)

- Relative: path from current location (e.g., data/file.txt)

- You can get the parent folder using getParent().

- You must first create a File object like this :
  File file = new File("example.txt");

=) System permissions (read, write, execute) can limit what you can do with a file.
=) A File object is immutable—its path cannot be changed after it's created.
