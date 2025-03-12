
import java.util.Arrays;
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        int[]   arr = new int[5];

        Scanner in = new Scanner(System.in);
        
        // array of objects 

        System.out.println("enter the number of persons ");
        int n = in.nextInt();

        System.out.println("Enter their names : ");

        String [] str = new String[n];

        for(int i=0 ; i < str.length ; i++){
            str[i] = in.next();
        }
           
           System.out.println(Arrays.toString(str));
         
           
     }
}