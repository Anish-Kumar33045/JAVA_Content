
import java.util.Scanner;

 

class sum {
    public static void main(String[] args) {    //  write psvm for short 
        System.out.println("enter the two numbers : ");

        Scanner input = new Scanner(System.in);

        int num1 ,num2 ;

        num1 = input.nextInt();
        num2 = input.nextInt();

        int sum = num1 + num2 ;
        System.out.println(sum);
        

    }
}