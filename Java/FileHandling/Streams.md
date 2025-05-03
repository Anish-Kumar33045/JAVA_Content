# Streams in Java

In Java, a sequence of data is known as a stream.
This concept is used to perform I/O operations on a file.

1. Input Stream
   The Java InputStream class is the superclass of all input streams.
   The input stream is used to read data from numerous input devices like the keyboard, network, etc. InputStream is an abstract class, and because of this, it is not useful by itself.
   However, its subclasses are used to read data.

Below are the types of Streams:

- AudioInputStream
- ByteArrayInputStream
- FileInputStream

Creating an InputStream:
// Creating an InputStream
InputStream obj = new FileInputStream();

2. Output Stream
   The output stream is used to write data to numerous output devices like the monitor, file, etc. OutputStream is an abstract superclass that represents an output stream. OutputStream is an abstract class and because of this, it is not useful by itself. However, its subclasses are used to write data.

There are several subclasses of the OutputStream class which are as follows:

- ByteArrayOutputStream
- FileOutputStream
- StringBufferOutputStream

Creating an OutputStream:
// Creating an OutputStream
OutputStream obj = new FileOutputStream();

Based on the data type, there are two types of streams:

1. Byte Stream
   This stream is used to read or write byte data. The byte stream is again subdivided into two types which are as follows:
   Byte Input Stream: Used to read byte data from different devices.
   Byte Output Stream: Used to write byte data to different devices.

2. Character Stream
   This stream is used to read or write character data. Character stream is again subdivided into 2 types which are as follows:

   Character Input Stream: Used to read character data from different devices.
   Character Output Stream: Used to write character data to different devices.
