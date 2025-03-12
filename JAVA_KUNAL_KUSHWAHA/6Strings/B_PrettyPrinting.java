public class B_PrettyPrinting {
    public static void main(String[] args) {
        float a = 345.3456f;
        // System.out.printf("Formatted number is : %.2f ",a);  // formatted print statement 
        // .(how many decimal places )f ; in the above statement 
        // System.out.printf("Value of Pi is : %.2f ",Math.PI);

        System.out.printf("My name is %s , I am %s ", "Anish" , "Coder"); // the order in which we place the arguments is also imp
         // these are the place holders 


    }
}
/*
 %d  - Integer
%f  - Floating-point number
%s  - String
%c  - Character
%b  - Boolean
%n  - Platform-specific new line

Modifiers for floating-point numbers:
%.2f    - Float with 2 decimal points
%10.3f  - Right-aligned float with width 10

Width and alignment:
%10d   - Right-aligned integer with width 10
%-10d  - Left-aligned integer with width 10

Hexadecimal and octal:
%x   - Hexadecimal (lowercase)
%X   - Hexadecimal (uppercase)
%o   - Octal

Specialized formatting:
%,d   - Number with commas
%e    - Scientific notation (lowercase)
%E    - Scientific notation (uppercase)

 */