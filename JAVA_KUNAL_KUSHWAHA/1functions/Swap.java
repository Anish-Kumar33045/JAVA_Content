import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        
        int num1 , num2 ;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
         num1 = in.nextInt();
         
        System.out.println("Enter the second number ");
        num2 = in.nextInt();

        System.out.println("Before swapping  first num = "+ num1 + " second num = "+ num2 );
        swap(num1,num2);
      
    }



   public static void swap(int num1 , int num2 )
   {
    int temp = num1 ;
    num1 = num2 ;
    num2 = temp ;
        System.out.println("After swapping  first num = "+ num1 + " second num = "+ num2 );
      }

}

/* 
 int a = 10 ;

 {
    int a = 100  
    a is already intialised outside the block 
    a can be updated or changed 


    int b = 34 ;
 
 }
    
   int b = 900;
   b is alreday intialised in the block but can be also intialsed out the block as well
   b is new variable now 

   similarly for ' for loop ' .


*/