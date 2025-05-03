# File operations

The following are the several operations that can be performed on a file in Java:

- Create a File
- Read from a File
- Write to a File
- Delete a File

1. Create a File
   Methods to Create Files in Java
   There are two methods mentioned below

Using the File Class
Using the FileOutputStream Class

=) Using the File Class
It is a class that is just a handle for underlying file system resources. It is used for those objects which do not have physical existence.

Syntax:

File.createNewFile()

=) Using the FileOutputStream Class
It is an output stream that can be written to FileOutputStream JavaDoc. It is used for those objects which are already existing.

Syntax:

new FileOutputStream(String filePath);

Example: echo > myFile.txt

# file writer

FileWriter class in Java is used to write character-oriented data to a file as this class is character-oriented because it is used in file handling in Java. There are many ways to write into a file in Java as there are many classes and methods which can fulfill the goal as follows:

Using writeString() method
Using FileWriter Class
Using BufferedWriter Class
Using FileOutputStream Class

1. Using writeString() Method
   This method can take four parameters. These are file path, character sequence, charset, and options. The first two parameters are mandatory for this method to write into a file. It writes the characters as the content of the file. It returns the file path and can throw four types of exceptions. It is better to use when the content of the file is short.

2. Using FileWriter Class
   If the content of the file is short, then using the FileWriter class to write in the file is another better option. It also writes the stream of characters as the content of the file like writeString() method. The constructor of this class defines the default character encoding and the default buffer size in bytes.

3. Using BufferedWriter Class
   It is used to write text to a character-output stream. It has a default buffer size, but a large buffer size can be assigned. It is useful for writing characters, strings, and arrays. It is better to wrap this class with any writer class for writing data to a file if no prompt output is required.
