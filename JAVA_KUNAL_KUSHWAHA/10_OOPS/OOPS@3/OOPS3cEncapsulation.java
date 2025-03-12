/*
 *  encapsulation --> 
 *  wrapping up the implementation of data numbers & methods in class
 * 
 *  abstraction --> hiding uneccessary details & focusing valuable information
 */
class SafeBox {
    private int secretCode; // This is hidden from the outside world

    // Method to set the secret code
    public void setSecretCode(int code) {
        if (code > 0) { // Check to ensure it's valid
            secretCode = code;
        }
    }

    // Method to get the secret code
    public int getSecretCode() {
        return secretCode;
    }
}

public class OOPS3cEncapsulation {
    
    
   
        public static void main(String[] args) {
            SafeBox box = new SafeBox();
            box.setSecretCode(1234); // Set the code using a method
            System.out.println("The code is: " + box.getSecretCode()); // Access it via a method
        }
    }
    
  