

public class A_message {
   
    
    public static void main(String[] args) {
        message();   
    }
    static void message(){
        System.out.println("Hello World!");
        message1();
    }
    static void message1(){
        System.out.println("Hello World!");
        message2();    
        
    }
    static void message2(){
        System.out.println("Hello World!");
        message3();
        
    }
    static void message3(){
       
        System.out.println("Hello World!");
        message();
       
    }
}
// run and debug the program to understand the how the function is called
// also understand how the function exits the block and come back to the main function 
