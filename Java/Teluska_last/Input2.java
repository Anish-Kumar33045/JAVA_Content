import java.io.IOException;
import java.util.Scanner;




class Input2{
    public static void main(String[] args) throws IOException 
    {
        System.out.println(" enter the number "); // print o/p
        

         Scanner sc = new Scanner (System.in /* mention where we get i/p */);
      
           int num = sc.nextInt();
          
          System.out.println(num);

         

    }
}